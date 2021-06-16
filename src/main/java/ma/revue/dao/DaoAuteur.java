package ma.revue.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.revue.beans.Auteur;

public class DaoAuteur {

//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "springContext.xml" });
	SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");

	public long addAuteur(Auteur auteur) {
		Session session = sessionFactory.getCurrentSession();
		session.save(auteur);
		return auteur.getIdAuteur();

	}

	public Set<Auteur> allAuteurs() {
		return null;

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
