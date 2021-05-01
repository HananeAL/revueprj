package ma.revue.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ma.revue.beans.Article;

public class DaoArticle implements IdaoArticle {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public long addArticle(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.save(article);
		return article.getIdArticle();

	}

	public Set<Article> allArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Article update(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Article article) {
		// TODO Auto-generated method stub

	}

	public Article findById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(long idArticle) {
		// TODO Auto-generated method stub

	}

}
