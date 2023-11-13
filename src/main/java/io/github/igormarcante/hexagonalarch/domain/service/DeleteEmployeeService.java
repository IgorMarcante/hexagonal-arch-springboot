package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.DeleteEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.DeleteEmployeePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteEmployeeService implements DeleteEmployeeUseCase {
    DeleteEmployeePort deleteEmployeePort;
    ArgumentChecker notExistEmployeeChecker;
    @Override
    public void deleteEmployee(String id) throws GlobalException {
        notExistEmployeeChecker.check(id);
        deleteEmployeePort.deleteEmployee(id);
    }
}
