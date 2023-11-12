package io.github.igormarcante.hexagonalarch.domain.ports.inbound;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface GetEmployeesUseCase {
    List<Employee> getEmployees();
}
