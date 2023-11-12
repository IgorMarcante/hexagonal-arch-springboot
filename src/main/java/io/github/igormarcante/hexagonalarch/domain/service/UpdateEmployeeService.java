package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.UpdateEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.UpdateEmployeePort;

public class UpdateEmployeeService implements UpdateEmployeeUseCase {
    UpdateEmployeePort updateEmployeePort;

    @Override
    public void updateEmployee(Employee employee) {
        updateEmployeePort.updateEmployee(employee);
    }
}
