package ma.revue.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	public Article() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idArticle")
	private long idArticle;

	@ElementCollection
	@CollectionTable(name = "keyWords")
	@Column(name = "keyWords")
	private List<String> keyWords = new ArrayList<String>();

	@Column(name = "resume")
	private String resume;

	public long getIdArticle() {
		return idArticle;
	}

	public String getResume() {
		return resume;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public List<String> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Enumerated(EnumType.STRING)
	private EtatArticle etatArticle;

	public void display() {
		// TODO Auto-generated method stub
		System.out.print("object create");
		;
	}
}
