package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeesPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetEmployeesAdapter implements GetEmployeesPort {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
