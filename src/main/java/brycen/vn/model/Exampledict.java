package brycen.vn.model;

import javax.persistence.*;

import javax.validation.constraints.Size;



@Entity // Hibernate entity

@Table(name="exampledict")
public class Exampledict {
	

	

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	
	@Size(min = 4, max = 255)
	private String kanjiSentemce;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKanjiSentemce() {
		return kanjiSentemce;
	}

	public void setKanjiSentemce(String kanjiSentemce) {
		this.kanjiSentemce = kanjiSentemce;
	}

	public String getVnSentence() {
		return vnSentence;
	}

	public void setVnSentence(String vnSentence) {
		this.vnSentence = vnSentence;
	}

	public String getHiraKataSentence() {
		return hiraKataSentence;
	}

	public void setHiraKataSentence(String hiraKataSentence) {
		this.hiraKataSentence = hiraKataSentence;
	}

//	public int getIdGrammar() {
//		return idGrammar;
//	}
//
//	public void setIdGrammar(int idGrammar) {
//		this.idGrammar = idGrammar;
//	}

	@Size(min = 4, max = 255)
	private String vnSentence;
	
	@Size(min = 4, max = 455)
	private String hiraKataSentence;
	
	
	
	@Column(columnDefinition = "int(1) default '1'")
	private int active;
	
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	
	
	
	@ManyToOne
    @JoinColumn(name="id_grammar", nullable=false,insertable=false, updatable=false)
	private Grammardict grammardict;
	


	public Exampledict() {
		
	}
	
	
	
}


