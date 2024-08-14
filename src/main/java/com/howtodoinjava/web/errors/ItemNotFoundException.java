package com.howtodoinjava.web.errors;

public class ItemNotFoundException extends RuntimeException {
    
    // private long id;

    public ItemNotFoundException(Long id) {
        super("Could not find item " + id);
    }
}
