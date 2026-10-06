package com.laura.petcare.service;

import com.laura.petcare.entity.Pet;
import com.laura.petcare.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }

}
