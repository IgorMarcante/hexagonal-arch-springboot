package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.GetEmployeesUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeesPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetEmployeesService implements GetEmployeesUseCase {
    GetEmployeesPort getEmployeesPort;

    @Override
    public List<Employee> getEmployees() {
        return getEmployeesPort.getEmployees();
    }
}
