package ma.revue.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ma.revue.beans.Article;

@Component
@Repository
public class DaoArticle implements IdaoArticle {

	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "springContext.xml" });
	SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");

	public long addArticle(Article article) {
		Session session = sessionFactory.openSession();
		session.save(article);
		System.out.println(article);
		return article.getIdArticle();

	}

	public Set<Article> allArticles() {
		Session session = sessionFactory.openSession();
//		Set<Article> articles = (Set<Article>) session.createQuery("from article").list();
		String hql = "from article";
		Query query = session.createQuery(hql);
		List<Article> articles = query.list();
		return (Set<Article>) articles;
	}

	public Article update(Article article) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(article);
		return article;
	}

	public void delete(Article article) {
		Session session = sessionFactory.openSession();
		session.delete(article);
	}

	public Article findById(long idArticle) {
		Session session = sessionFactory.openSession();
		Article article = session.get(Article.class, idArticle);
		return article;
	}

	public void deleteById(long idArticle) {
		Session session = sessionFactory.openSession();
		Article article = session.get(Article.class, idArticle);
		session.delete(article);
	}

}
