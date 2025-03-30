package com.example.week.production_ready_features.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }


}
