package projetAppli;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if (op.equals("inscription")) {
			String nom = request.getParameter("name");
			String prenom = request.getParameter("firstname");
			String mail = request.getParameter("email");
			String identifiant = request.getParameter("username");
			String motDePasse = request.getParameter("password");
			facade.ajoutUtilisateur(nom, prenom,mail,identifiant,motDePasse);
			request.getRequestDispatcher("index.html").forward(request, response);
		}
		
		if (op.equals("explorer annonces")) {
			request.setAttribute("listeannonces", facade.listeAnnonces());
			request.getRequestDispatcher("liste.jsp").forward(request, response);
		}
		
		if (op.equals("connexion")){
			//request.setAttribute("listepersonnes", facade.listeUtilisateur());
			String identifiant = request.getParameter("username");
			String motDePasse = request.getParameter("password");
			//request.setAttribute("inscrit",facade.inscrit(identifiant, motDePasse));
			boolean inscrit = (boolean) facade.inscrit(identifiant, motDePasse);
			if (inscrit){
				request.getRequestDispatcher("indexLogged.html").forward(request, response);
			}
			else{
				request.getRequestDispatcher("inscription.html").forward(request, response);
			}
			

		}

	}

}