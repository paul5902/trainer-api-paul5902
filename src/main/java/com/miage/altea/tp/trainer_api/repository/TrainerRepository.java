package com.miage.altea.tp.trainer_api.repository;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TrainerRepository extends CrudRepository<Trainer,String> {

    Trainer save(Trainer entity);

    Optional<Trainer> findById(String primaryKey);

    Iterable<Trainer> findAll();


}
