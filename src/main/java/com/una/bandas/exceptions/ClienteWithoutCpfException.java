package com.una.bandas.exceptions;

public class ClienteWithoutCpfException extends RuntimeException {


    public ClienteWithoutCpfException(String s) {
        super(s);
    }
}
