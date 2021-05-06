package ma.revue.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import ma.revue.beans.Article;

@ContextConfiguration(locations= "classpath:springContext.xml")
public class TestDaoArticle {

	@Autowired
	IdaoArticle daoArticle;
	
	
	@Test
	public void testAddArticle() {
		Article article1 = new Article();
		article1.setResume("block1");
		daoArticle.addArticle(article1);
		long id = article1.getIdArticle();
		assertEquals("block1", daoArticle.findById().getResume());
	}
}
