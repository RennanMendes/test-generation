package org.generation.generationstudents.domain.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {
        super("User not found!");
    }
}
