package io.github.igormarcante.hexagonalarch.domain.ports.inbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

import java.util.Optional;

public interface GetEmployeeUseCase {
    Optional<Employee> getEmployee(String id);
}
