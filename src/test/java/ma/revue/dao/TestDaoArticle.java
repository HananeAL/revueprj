package ma.revue.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ma.revue.beans.Article;
import ma.revue.configuration.AppConfig;
import ma.revue.services.IArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class TestDaoArticle {

	@Autowired
	IArticleService articleService;

	@Test
	public void testAddArticle() {
		Article article1 = new Article();
		article1.setResume("block1");
		articleService.addArticle(article1);
		long id = article1.getIdArticle();
		assertEquals("block1", articleService.findById(id).getResume());
	}
}
