package ma.revue.dao;

import java.util.Set;

import ma.revue.beans.Auteur;

public interface IdaoAuteur {
	
	long addAuteur(Auteur auteur);
	public Set<Auteur> allArticles();
	public Auteur update(Auteur auteur);
	public void delete(Auteur auteur);
	public Auteur findById();
	public void deleteById(long idAuteur);
}
