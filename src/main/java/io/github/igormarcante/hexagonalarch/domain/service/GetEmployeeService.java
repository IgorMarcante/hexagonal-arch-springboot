package io.github.igormarcante.hexagonalarch.domain.service;

import io.github.igormarcante.hexagonalarch.domain.exception.NotFoundException;
import io.github.igormarcante.hexagonalarch.domain.exception.constants.ErrorConstant;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.GetEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class GetEmployeeService implements GetEmployeeUseCase {
    GetEmployeePort getEmployeePort;
    @Override
    public Optional<Employee> getEmployee(String id) {
        return Optional.ofNullable(getEmployeePort.getEmployee(id).orElseThrow(() -> new NotFoundException(ErrorConstant.NOT_FOUND_MESSAGE)));
    }
}
