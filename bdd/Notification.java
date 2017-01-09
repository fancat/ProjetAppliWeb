package projetAppli;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Notification {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	int id;
	String message;
	
	@ManyToMany
	Collection<Utilisateur> invites;
	
	public int getId(){
		return id;
	}
	
	public String getMessage(){
		return message;
	}
	
	public Collection<Utilisateur> getInvites(){
		return invites;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public void setInvites(Collection<Utilisateur> invites){
		this.invites = invites;
	}
	
	public void ajoutInvit(Utilisateur invite){
		invites.add(invite);
	}
}
