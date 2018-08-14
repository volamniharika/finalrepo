package com.example.sampleapplication.exception;

public class productNotFoundException extends Exception{


    String message;
    public productNotFoundException(String message) {
        super(message);
        this.message=message;


    }

    public String getErrorMessage()
    {
        return message;
    }
}
