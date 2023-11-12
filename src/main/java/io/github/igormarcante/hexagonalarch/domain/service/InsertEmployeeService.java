package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.InsertEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.InsertEmployeePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InsertEmployeeService implements InsertEmployeeUseCase {
    InsertEmployeePort insertEmployeePort;
    ArgumentChecker existEmployeeChecker;

    @Override
    public void createEmployee(Employee employee) throws GlobalException {
        existEmployeeChecker.check(employee.getDocumentNumber());
        insertEmployeePort.createEmployee(employee);
    }
}
