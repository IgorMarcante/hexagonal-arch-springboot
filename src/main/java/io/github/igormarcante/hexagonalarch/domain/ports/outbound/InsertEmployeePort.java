package io.github.igormarcante.hexagonalarch.domain.ports.outbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

public interface InsertEmployeePort {
    void createEmployee(Employee employee);
}
