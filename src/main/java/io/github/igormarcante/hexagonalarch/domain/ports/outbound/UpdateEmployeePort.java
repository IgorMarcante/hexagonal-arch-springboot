package io.github.igormarcante.hexagonalarch.domain.ports.outbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

public interface UpdateEmployeePort {
    void updateEmployee(Employee employee);
}
