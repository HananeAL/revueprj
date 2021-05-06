package ma.revue.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ma.revue.beans.Article;
import ma.revue.beans.Auteur;

public class DaoAuteur {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public long addAuteur(Auteur auteur) {
		Session session = sessionFactory.getCurrentSession();
		session.save(auteur);
		return auteur.getIdAuteur();

	}
	
	public Set<Auteur> allAuteurs() {
		 
	}

	public Auteur update(Auteur auteur) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Auteur auteur) {
		// TODO Auto-generated method stub

	}

	public Auteur findById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(long idAuteur) {
		// TODO Auto-generated method stub

	}

	
	
}
