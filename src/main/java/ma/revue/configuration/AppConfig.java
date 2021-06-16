package ma.revue.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.revue.dao.DaoArticle;
import ma.revue.dao.IdaoArticle;
import ma.revue.services.ArticleService;
import ma.revue.services.IArticleService;

@Configuration
//@ComponentScan(basePackages = "ma.revue.dao")
public class AppConfig {

	@Bean
	public IArticleService articleService(IdaoArticle daoArticle) {
		IArticleService articleService = new ArticleService();
		articleService.setClientDao(daoArticle);
		return articleService;
	}

	@Bean
	public IdaoArticle getDaoArticle() {
		return new DaoArticle();
	}
}
