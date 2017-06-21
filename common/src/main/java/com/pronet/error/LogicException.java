package com.pronet.error;

/**
 * Created by prith on 20-06-2017.
 */
public class LogicException extends RuntimeException {
    private String messsage;

    public LogicException(String message) {
        this.messsage = message;
    }
}
