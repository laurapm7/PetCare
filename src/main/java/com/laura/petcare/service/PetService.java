package com.laura.petcare.service;

import com.laura.petcare.entity.Pet;
import com.laura.petcare.exception.PetNotFoundException;
import com.laura.petcare.repository.PetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Optional<Pet> findById(Long id) {
        return petRepository.findById(id);
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }

    @Transactional
    public Pet update(Long id, Pet updatedPet) {
        Pet existingPet = petRepository.findById(id).orElseThrow(()-> new PetNotFoundException(id));
        existingPet.setName(updatedPet.getName());
        existingPet.setSpecies(updatedPet.getSpecies());
        existingPet.setBirthDate(updatedPet.getBirthDate());
        return petRepository.save(existingPet);
    }

}
