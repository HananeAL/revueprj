package ma.revue.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Affiliation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAffiliation;
	
	@Column(name = "libelle")
	private String libelle;
	
	public Affiliation() {
		
	}

	public long getIdAffiliation() {
		return idAffiliation;
	}

	public void setIdAffiliation(long idAffiliation) {
		this.idAffiliation = idAffiliation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
