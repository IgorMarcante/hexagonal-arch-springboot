package io.github.igormarcante.hexagonalarch.domain.checker;

import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;

public interface ArgumentChecker {
    void check(Object fieldValue) throws GlobalException;

}
