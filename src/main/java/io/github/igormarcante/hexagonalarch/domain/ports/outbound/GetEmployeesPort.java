package io.github.igormarcante.hexagonalarch.domain.ports.outbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

import java.util.List;

public interface GetEmployeesPort {
    List<Employee> getEmployees();
}
