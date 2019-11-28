package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
