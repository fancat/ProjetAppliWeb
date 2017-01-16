package projetAppli;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Instrument {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String type;
	
	@ManyToMany(mappedBy="instruments", fetch = FetchType.EAGER)
	Collection<Utilisateur> owners;

	@ManyToMany
	Collection<Utilisateur> annonces;

	
	public int getId(){
		return id;
	}
	
	public String getType(){
		return type;
	}
	
		
	public Collection<Utilisateur> getOwners(){
		return owners;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setOwners(Collection<Utilisateur> owners){
		this.owners = owners;
	}
	
	public void addOwner(Utilisateur u){
		owners.add(u);
	}
}
