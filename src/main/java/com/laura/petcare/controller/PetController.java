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

    @GetMapping("/{id}")
    public ResponseEntity<Pet> findById(@PathVariable("id") Long id) {
        return ResponseEntity.of(petService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pet> update(@PathVariable("id") Long id, @RequestBody Pet pet) {
        Pet updatedPet= petService.update(id,pet);
        return ResponseEntity.ok(updatedPet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        petService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
