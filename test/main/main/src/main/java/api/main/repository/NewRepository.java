package api.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.main.entity.NewEntity;

@Repository
public interface NewRepository extends JpaRepository<NewEntity,Integer>{
    
}
