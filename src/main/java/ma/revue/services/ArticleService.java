package ma.revue.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.revue.beans.Article;
import ma.revue.dao.IdaoArticle;

@Service("articleService")
@Transactional
public class ArticleService implements IArticleService {

	@Autowired
	IdaoArticle daoArticle;

	@Transactional
	public long addArticle(Article article) {
		return daoArticle.addArticle(article);
	}

	public Set<Article> allArticles() {
		return daoArticle.allArticles();
	}

	public Article update(Article article) {
		return daoArticle.update(article);
	}

	public void delete(Article article) {
		daoArticle.delete(article);

	}

	public Article findById(long idArticle) {
		return daoArticle.findById(idArticle);
	}

	public void deleteById(long idArticle) {
		daoArticle.deleteById(idArticle);
	}

}
