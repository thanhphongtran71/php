package brycen.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import brycen.vn.model.Exampledict;


@Repository
public interface ExampledictRepository extends  JpaRepository<Exampledict, Long>{

}
