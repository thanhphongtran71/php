package brycen.vn.model;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity // Hibernate entity
@Table(name="level")
public class Level {

	public Level(long id, Collection<Grammardict> grammardict, @NotNull String level_name) {
		super();
		this.id = id;
		this.grammardict = grammardict;
		this.level_name = level_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLevel_name() {
		return level_name;
	}

	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	
//	
//	@OneToMany(mappedBy="level")
//	private Set<Grammardict> grammardicts;
//	public Set<Grammardict> getGrammardicts () {
//	      return grammardicts ;
//	    }
	@OneToMany(mappedBy = "level", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (Grammardict) (
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Grammardict> grammardict;
	
	@NotNull
	private String level_name;
}
