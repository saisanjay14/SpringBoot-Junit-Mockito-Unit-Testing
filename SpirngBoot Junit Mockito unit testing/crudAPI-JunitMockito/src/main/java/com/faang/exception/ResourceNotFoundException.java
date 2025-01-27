package com.faang.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message) {
        super("Employee already exist with given email:");
    }
}

