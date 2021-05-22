package ma.revue.contoller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.revue.beans.Article;
import ma.revue.services.IArticleService;

@RestController
public class ArticleController {

	@Autowired
	IArticleService articleService;

	@RequestMapping(value = { "/article" }, method = RequestMethod.POST, produces = "application/json")
	public long addArticle(@RequestBody Article article) {
		return articleService.addArticle(article);
	}

	@RequestMapping(value = { "/articles" }, method = RequestMethod.GET, produces = "application/json")
	public Set<Article> allArticles() {
		return articleService.allArticles();
	}

	@RequestMapping(value = { "/articles/{idArticle}" }, method = RequestMethod.GET, produces = "application/json")
	public Article findById(@PathVariable long idArticle) {
		return articleService.findById(idArticle);
	}

	@RequestMapping(value = { "/article" }, method = RequestMethod.PUT, produces = "application/json")
	public Article update(@RequestBody Article article) {
		return articleService.update(article);
	}

	@RequestMapping(value = { "/article" }, method = RequestMethod.DELETE, produces = "application/json")
	public void delete(@RequestBody Article article) {
		articleService.delete(article);
	}

	@RequestMapping(value = { "/articles/{idArticle}" }, method = RequestMethod.DELETE, produces = "application/json")
	public void deleteById(@PathVariable long idArticle) {
		articleService.deleteById(idArticle);
	}

}
