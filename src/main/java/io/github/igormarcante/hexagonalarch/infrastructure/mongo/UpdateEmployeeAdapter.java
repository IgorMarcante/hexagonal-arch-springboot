package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.UpdateEmployeePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateEmployeeAdapter implements UpdateEmployeePort {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
