package com.laura.petcare.controller;

import com.laura.petcare.entity.Pet;
import com.laura.petcare.service.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @PostMapping
    public ResponseEntity<Pet> create(@RequestBody Pet pet) {
        Pet savedPet = petService.create(pet);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedPet);
    }

}
