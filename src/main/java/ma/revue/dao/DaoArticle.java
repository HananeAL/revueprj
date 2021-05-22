package ma.revue.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ma.revue.beans.Article;

@Component
@Repository
public class DaoArticle implements IdaoArticle {

	// injection par anotation
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
		Session session = sessionFactory.getCurrentSession();
		Set<Article> articles = (Set<Article>) session.createQuery("from article").list();
		return articles;
	}

	public Article update(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(article);
		return article;
	}

	public void delete(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(article);
	}

	public Article findById(long idArticle) {
		Session session = sessionFactory.getCurrentSession();
		Article article = session.get(Article.class, idArticle);
		return article;
	}

	public void deleteById(long idArticle) {
		Session session = sessionFactory.getCurrentSession();
		Article article = session.get(Article.class, idArticle);
		session.delete(article);
	}

}
