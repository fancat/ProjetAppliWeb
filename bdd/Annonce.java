package projetAppli;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Annonce {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	int id;
	String date;
	String description;
	
	@OneToMany
	Collection<Instrument> instrus;
	
	public int getId(){
		return id;
	}
	
	public String getDate(String date){
		return date;
	}
	
	public String getDescr(){
		return description;
	}
	
	public Collection<Instrument> getInstrus(){
		return instrus;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setDescr(String descr){
		this.description = descr;
	}
	
	public void setInstrus(Collection<Instrument> instrus){
		this.instrus = instrus;
	}
	
	
}
