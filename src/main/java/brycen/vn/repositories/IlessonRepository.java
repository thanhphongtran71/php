package brycen.vn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import brycen.vn.model.Grammardict;

@Repository
public interface IlessonRepository extends JpaRepository<Grammardict, Long>{
	@Query(value = "SELECT * FROM gramardict where level = ?1 and lesson = ?2", nativeQuery = true)
	List<Grammardict> getDictionaryByLevel(Long level, int lesson);	
}
