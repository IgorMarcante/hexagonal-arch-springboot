package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.ports.inbound.DeleteEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.DeleteEmployeePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteEmployeeService implements DeleteEmployeeUseCase {
    DeleteEmployeePort deleteEmployeePort;
    @Override
    public void deleteEmployee(String id) {
        deleteEmployeePort.deleteEmployee(id);
    }
}
