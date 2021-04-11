package brycen.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import brycen.vn.model.Grammardict;


@Repository
public interface GrammardictRepository extends  JpaRepository<Grammardict, Long>{
	Grammardict findByTitleJp(String title_jp);
	
	
}
