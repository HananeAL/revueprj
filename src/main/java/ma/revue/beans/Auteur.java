package ma.revue.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auteur")
public class Auteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAuteur;

	@Column(name = "nom")
	private String nom;

	public Auteur() {

	}

	public long getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(long idAuteur) {
		this.idAuteur = idAuteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
