package io.github.igormarcante.hexagonalarch.domain.exception;

import java.io.Serial;

public class GlobalException extends Exception{
    @Serial
    private static final long serialVersionUID = 2657421385406221858L;

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}
