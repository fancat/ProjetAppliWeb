package projetAppli;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class Facade {
	@PersistenceContext
	private EntityManager em;
	
	public void ajoutUtilisateur(String nom, String prenom, String identifiant, String motDePasse, String mail){
		Utilisateur u = new Utilisateur();
		u.setNom(nom);
		u.setPrenom(prenom);
		u.setAdMail(mail);
		u.setIdentifiant(identifiant);
		u.setMdp(motDePasse);
		em.persist(u);
	}
	
	public void ajoutInstrument(String type){
		Instrument i = new Instrument();
		i.setType(type);
		em.persist(i);
	}
	
	public void ajoutCompetence(int idUtilisateur,int idInstrument){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		Instrument i = em.find(Instrument.class, idInstrument);
		Collection<Instrument> instrus = u.getInstruments();
		instrus.add(i);
		u.setInstruments(instrus);
		em.persist(u);
	}
	
	public void ajoutAnnonce(String date, String description, Collection<Instrument> instrus){
		Annonce a = new Annonce();
		a.setDate(date);
		a.setDescr(description);
		a.setInstrus(instrus);
		em.persist(a);
	}
	
	public void ajoutNotification(String message){
		Notification n = new Notification();
		n.setMessage(message);
		em.persist(n);
	}
	
	public void ajoutIns(String type){
		Instrument i = new Instrument();
		i.setType(type);
		em.persist(i);
		
	}
	
	public void associer(String typeInstru, String identifiant){
		Collection<Utilisateur> utilisateurs = em.createQuery("from Utilisateur", Utilisateur.class).getResultList();
		Utilisateur u1= null;
		for (Utilisateur u: utilisateurs){
			if(u.getIdentifiant().equals(identifiant)){
				u1 = u;
			}
		}
		Collection<Instrument> instrus = em.createQuery("from Instrument", Instrument.class).getResultList();
		Instrument i1 = null;
		for(Instrument i : instrus){
			if(i.getType().equals(typeInstru)){
				i1=i;
			}
		}
		u1.addInstru(i1);
		i1.addOwner(u1);
		
		
	}
	
	public void enleverCompetence(int idUtilisateur,int idInstrument){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		Instrument i = em.find(Instrument.class, idInstrument);
		Collection<Instrument> instrus = u.getInstruments();
		instrus.remove(i);
		u.setInstruments(instrus);
		em.persist(u);
	}
	
	public void changerMotDePasse(int idUtilisateur, String mdp){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setMdp(mdp);
	}
	
	public void changerMail(int idUtilisateur, String mail){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setAdMail(mail);
	}
	
	public void changerNom(int idUtilisateur, String nom){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setNom(nom);
		
	}
	
	public void changerPrenom(int idUtilisateur, String prenom){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setPrenom(prenom);
		
	}
	
	public Collection<Utilisateur> listeUtilisateur(){
		return em.createQuery("from Utilisateur", Utilisateur.class).getResultList();
	}
	
	public Collection<Instrument> listeInstrument(){
		return em.createQuery("from Instrument", Instrument.class).getResultList();
	}

	public Collection<Annonce> listeAnnonces(){
		return em.createQuery("from Annonce", Annonce.class).getResultList();
	}

	public boolean inscrit(String identifiant, String motDePasse) {
		Collection<Utilisateur> inscrits = (Collection<Utilisateur>) em.createQuery("from Utilisateur", Utilisateur.class).getResultList();
		boolean res=false;
		
		for(Utilisateur u:inscrits){
			if ((u.getIdentifiant()).equals(identifiant) && (u.getMdp()).equals(motDePasse)){
				res = true;
			}
		}
        return(res);
		

	}
	
}