package com.cimplyFive.companyregistration.exception;

public class EmailFailureException extends RuntimeException {

    public EmailFailureException(String message) {
        super(message);
    }
}
