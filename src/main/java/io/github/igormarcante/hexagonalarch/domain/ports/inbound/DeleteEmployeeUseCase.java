package io.github.igormarcante.hexagonalarch.domain.ports.inbound;

import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;

public interface DeleteEmployeeUseCase {
    void deleteEmployee(String id) throws GlobalException;
}
