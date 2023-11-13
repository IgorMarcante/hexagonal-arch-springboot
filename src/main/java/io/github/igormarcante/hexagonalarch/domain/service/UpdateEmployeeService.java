package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.UpdateEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.UpdateEmployeePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateEmployeeService implements UpdateEmployeeUseCase {
    UpdateEmployeePort updateEmployeePort;
    ArgumentChecker notExistEmployeeChecker;

    @Override
    public void updateEmployee(Employee employee) throws GlobalException {

        notExistEmployeeChecker.check(employee.getId());
        updateEmployeePort.updateEmployee(employee);
    }
}
