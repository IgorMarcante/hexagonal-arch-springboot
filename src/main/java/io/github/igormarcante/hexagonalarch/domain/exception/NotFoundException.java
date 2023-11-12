package io.github.igormarcante.hexagonalarch.domain.exception;

import java.io.Serial;

public class NotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 304452150131790115L;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
