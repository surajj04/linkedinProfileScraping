package org.bytetech.exceptions;

public class ElementNotFound extends RuntimeException {
    public ElementNotFound(String message) {
        super(message);
        System.out.println(message);
    }
}
