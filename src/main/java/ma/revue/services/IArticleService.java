package ma.revue.services;

import java.util.Set;

import ma.revue.beans.Article;
import ma.revue.dao.IdaoArticle;

public interface IArticleService {

	long addArticle(Article article);

	public Set<Article> allArticles();

	public Article update(Article article);

	public void delete(Article article);

	public Article findById(long idArticle);

	public void deleteById(long idArticle);

	void setClientDao(IdaoArticle daoArticle);
}
