package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.InsertEmployeePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertEmployeeAdapter implements InsertEmployeePort {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
