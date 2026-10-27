package com.laura.petcare.exception;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(Long id) {
        super("No se ha podido encontrar la mascota con el id: " + id);
    }
}
