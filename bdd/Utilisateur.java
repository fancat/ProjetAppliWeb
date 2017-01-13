package projetAppli;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	private String nom;
	private String prenom;
	private String identifiant;
	private String adMail;
	private String mdp;
	
	@ManyToMany
	Collection<Instrument> instruments;
	
	@ManyToMany
	Collection<Notification> notifications;
	
	@ManyToMany
	Collection<Groupe> groupes;
	
	public Utilisateur(){
		super();
	}
	
	public int getId(){
		return id;
	}
	
	public String getIdentifiant(){
		return identifiant;
	}
		
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public String getAdMail(){
		return adMail;
	}
	
	public String getMdp(){
		return mdp;
	}
	
	public Collection<Instrument> getInstruments(){
		return instruments;
	}
	
	public Collection<Notification> getNotifications(){
		return notifications;
	}	
	
	public Collection<Groupe> getGroupes(){
		return groupes;
	}	
	
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setIdentifiant(String identifiant){
		this.identifiant = identifiant;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public void setAdMail(String adMail){
		this.adMail = adMail;
	}
	
	public void setMdp(String mdp){
		this.mdp = mdp;
	}
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments = instruments;
	}
//	
//	public void ajoutInstrument(Instrument inst){
//		instruments.add(inst);
//	}
//	
//	public void retireInstrument(Instrument inst){
//		instruments.remove(inst);
//	}
	public void setNotifications(Collection<Notification> notifications){
		this.notifications = notifications;
	}	
	public void setGroupes(Collection<Groupe> groupes){
		this.groupes = groupes;
	}	
}
