package com.manav.redisimplementationdb;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2L;
    public UserNotFoundException(String message) {
        super(message);
    }
}
