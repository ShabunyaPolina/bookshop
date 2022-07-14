package com.es.bookshop.exception;

public class EmptyStorageException extends RuntimeException {
    public EmptyStorageException() {
        super();
    }

    public EmptyStorageException(String message) {
        super(message);
    }
}
