package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetEmployeeAdapter implements GetEmployeePort {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> getEmployee(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean existsEmployee(String documentNumber) {
        return employeeRepository.existsByDocumentNumber(documentNumber);
    }
}
