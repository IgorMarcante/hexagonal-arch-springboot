package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.ports.outbound.DeleteEmployeePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteEmployeeAdapter implements DeleteEmployeePort {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
