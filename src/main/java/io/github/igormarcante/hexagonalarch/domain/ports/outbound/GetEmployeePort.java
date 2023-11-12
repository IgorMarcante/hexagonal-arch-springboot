package io.github.igormarcante.hexagonalarch.domain.ports.outbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

import java.util.Optional;

public interface GetEmployeePort {
    Optional<Employee> getEmployee(String id);

    boolean existsEmployee(String documentNumber);
}
