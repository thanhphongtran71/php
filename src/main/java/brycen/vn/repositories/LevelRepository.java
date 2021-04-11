package brycen.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import brycen.vn.model.Level;

@Repository
public interface LevelRepository extends  JpaRepository<Level, Long>{

}

