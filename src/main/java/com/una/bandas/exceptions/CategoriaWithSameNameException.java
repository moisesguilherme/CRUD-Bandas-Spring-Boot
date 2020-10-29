package com.una.bandas.exceptions;

public class CategoriaWithSameNameException extends RuntimeException {

    public CategoriaWithSameNameException(String s) {
        super(s);
    }
}
