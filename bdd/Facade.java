package projetAppli;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Facade {
	@PersistenceContext
	private EntityManager em;
	
	public void ajoutUtilisateur(String nom, String prenom, String identifiant, String motDePasse, String mail){
		Utilisateur u = new Utilisateur();
		u.setNom(nom);
		u.setPrenom(prenom);
		u.setAdressMail(mail);
		u.setIdentifiant(identifiant);
		u.setMotDePasse(motDePasse);
		em.persist(u);
	}
	
	public void ajoutInstrument(String type){
		Instrument i = new Instrument();
		i.setType(type);
	}
	
	public void ajoutCompetence(int idUtilisateur,int idInstrument){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		Instrument i = em.find(Instrument.class, idInstrument);
		u.ajoutInstrument(i);
	}
	
	public void enleverCompetence(int idUtilisateur,int idInstrument){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		Instrument i = em.find(Instrument.class, idInstrument);
		u.retireInstrument(i);
		
	}
	
	public void changerMotDePasse(int idUtilisateur, String mdp){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setMotDePasse(mdp);
	}
	
	public void changerMail(int idUtilisateur, String mail){
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setAdressMail(mail);
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
	
	public boolean inscrit(String identifiant, String motDePasse){
		Collection<Utilisateur> inscrits = em.createQuery(
			    "SELECT u FROM Utilisateur u WHERE u.identifiant LIKE :identifiant and u.mdp LIKE:motDePasse");
		if (inscrits.size()==1){
			return(true);
		}
		else{
			return(false);
		}
	}
	
}