package com.solpyra.common.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
    private final String errorCode;


    public NotFoundException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public NotFoundException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}