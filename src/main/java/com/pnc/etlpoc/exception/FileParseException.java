package com.pnc.etlpoc.exception;

/**
 * Exception
 */
public class FileParseException  extends RuntimeException {

    public FileParseException(String message) {
        super(message);
    }

    public FileParseException(String message, Throwable cause) {
        super(message, cause);
    }

}
