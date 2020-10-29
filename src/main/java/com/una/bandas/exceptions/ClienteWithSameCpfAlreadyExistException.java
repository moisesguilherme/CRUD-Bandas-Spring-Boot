package com.una.bandas.exceptions;

public class ClienteWithSameCpfAlreadyExistException extends RuntimeException {


    public ClienteWithSameCpfAlreadyExistException(String s) {
        super(s);
    }
}
