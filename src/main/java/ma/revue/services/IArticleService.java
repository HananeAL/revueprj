package ma.revue.services;

import java.util.Set;

import ma.revue.beans.Article;

public interface IArticleService {

	long addArticle(Article article);

	public Set<Article> allArticles();

	public Article update(Article article);

	public void delete(Article article);

	public Article findById(long idArticle);

	public void deleteById(long idArticle);
}
