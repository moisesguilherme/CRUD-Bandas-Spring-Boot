package com.una.bandas.exceptions;

public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException() {
    }

    public ClienteNotFoundException(String message) {
        super(message);
    }
}
