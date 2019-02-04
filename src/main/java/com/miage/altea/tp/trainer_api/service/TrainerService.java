package com.miage.altea.tp.trainer_api.service;

import com.miage.altea.tp.trainer_api.bo.Trainer;

import java.util.Optional;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Optional<Trainer> getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
}
