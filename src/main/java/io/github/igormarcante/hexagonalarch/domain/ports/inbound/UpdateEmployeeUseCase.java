package io.github.igormarcante.hexagonalarch.domain.ports.inbound;

import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;

public interface UpdateEmployeeUseCase {
    void updateEmployee(Employee employee) throws GlobalException;
}
