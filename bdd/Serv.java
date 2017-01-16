package projetAppli;

import java.io.IOException;
import java.util.Collection;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv
 */
@WebServlet("/Serv")
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	Facade facade;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String op =  request.getParameter("op");
		HttpSession session = request.getSession();
		if (op.equals("inscription")) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String mail = request.getParameter("email");
			String identifiant = request.getParameter("identifiant");
			String motDePasse = request.getParameter("motdepasse");
			String mdp = request.getParameter("confirmer");
			facade.ajoutUtilisateur(nom, prenom,identifiant,motDePasse,mail);
			if (motDePasse.equals(mdp)){
				request.getRequestDispatcher("index.html").forward(request, response);
			}else{
				request.getRequestDispatcher("inscrEchoue.html").forward(request, response);
			}
		}
		
		if (op.equals("explorer annonces")) {
			request.setAttribute("listeannonces", facade.listeAnnonces());
			request.getRequestDispatcher("listeAnnonces.jsp").forward(request, response);
		}
		
		if (op.equals("connexion")){
			//request.setAttribute("listepersonnes", facade.listeUtilisateur());
			String identifiant = request.getParameter("username");
			String motDePasse = request.getParameter("password");
			//request.setAttribute("inscrit",facade.inscrit(identifiant, motDePasse));
			boolean inscrit = (boolean) facade.inscrit(identifiant, motDePasse);
			if (inscrit){
				session.setAttribute("identifiant", identifiant);
				request.setAttribute("identifiant",identifiant);
				session.setAttribute("listeinstruments", facade.listeInstrument());
				request.getRequestDispatcher("indexLogged.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("pasInscrit.html").forward(request, response);
			}
			
		}

		if (op.equals("Ajouter un instrument")){
			String type = request.getParameter("typeInstru");
			facade.ajoutIns(type);
			String ident= (String) session.getAttribute("identifiant");
			request.setAttribute("identifiant",ident);
			facade.associer(type, ident);
			request.getRequestDispatcher("indexLogged.jsp").forward(request,response);			
		}
		
		if (op.equals("Déposer une annonce")){
			request.setAttribute("listeinstruments", facade.listeInstrument());
			String date = request.getParameter("date");
			String description = request.getParameter("description");
			String instrus = request.getParameter("instrus");
			//facade.ajoutAnnonce(date, description, instrus);
			request.getRequestDispatcher("index.html").forward(request,response);
		}
		
		


	}

}