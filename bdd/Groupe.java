package projetAppli;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Groupe {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	int id;
	String date;
	String lieu;
	
	@ManyToMany(mappedBy="groupes", fetch = FetchType.EAGER)
	Collection<Utilisateur> participants;
	

	public int getId(){
		return id;
	}
	
	public String getDate(){
		return date;
	}
	
	public String getLieu(){
		return lieu;
	}
	
	public Collection<Utilisateur> getParticipants(){
		return participants;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
	public void setDate(String date){
		this.date = date; 
	}
	
	public void setLieu(String lieu){
		this.lieu = lieu;
	}
	
	public void setParticipants(Collection<Utilisateur> participants){
		this.participants = participants;
	}
	
	public void ajoutParticipants(Utilisateur utilisateur){
		participants.add(utilisateur);
	}
	
	public void supprimerParticipants(Utilisateur utilisateur){
		participants.remove(utilisateur);
	}
}
