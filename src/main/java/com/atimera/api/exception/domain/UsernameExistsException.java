package com.atimera.api.exception.domain;

public class UsernameExistsException extends Exception{
    public UsernameExistsException(String message) {
        super(message);
    }
}
