package brycen.vn.model;



import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity // Hibernate entity

@Table(name="gramardict")
public class Grammardict {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	
//	@OneToMany(mappedBy="grammardict")
//	private Set<Exampledict> exampledict;
//	
//	public Set<Exampledict> getExampledict () {
//	      return exampledict ;
//	    }
	
	@OneToMany(mappedBy = "grammardict", cascade = CascadeType.ALL) 
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Exampledict> exampledict;
	
	
	@ManyToOne
    @JoinColumn(name="level", nullable=false,insertable=false, updatable=false)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Level level;
	
	
	@Size(min = 4, max = 255)
	private String titleJp;
	
	@Size(min = 4, max = 500)
	private String titleVn;
	
	@Size(min = 4, max = 500)
	private String grammmerJp;
	
	

	@Size(min = 4, max = 1200)
	private String note;
	
	@Column(columnDefinition = "int(1) default '1'")
	private int active;
	public Grammardict() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	
	public String getTitleJp() {
		return titleJp;
	}

	public void setTitleJp(String titleJp) {
		this.titleJp = titleJp;
	}

	public String getTitleVn() {
		return titleVn;
	}

	public void setTitleVn(String titleVn) {
		this.titleVn = titleVn;
	}

	public String getGrammmerJp() {
		return grammmerJp;
	}

	public void setGrammmerJp(String grammmerJp) {
		this.grammmerJp = grammmerJp;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	

	

}
