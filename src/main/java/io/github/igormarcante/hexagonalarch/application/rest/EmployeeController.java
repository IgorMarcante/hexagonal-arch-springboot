package io.github.igormarcante.hexagonalarch.application.rest;

import io.github.igormarcante.hexagonalarch.application.rest.response.CreateEmployeeResponse;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController implements EmployeeRestClient {
    private final GetEmployeeUseCase getEmployeeUseCase;
    private final GetEmployeesUseCase getEmployeesUseCase;
    private final InsertEmployeeUseCase insertEmployeeUseCase;
    private final DeleteEmployeeUseCase deleteEmployeeUseCase;
    private final UpdateEmployeeUseCase updateEmployeeUseCase;

    @Override
    public ResponseEntity<Optional<Employee>> getEmployee(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(getEmployeeUseCase.getEmployee(id));
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(getEmployeesUseCase.getEmployees());
    }

    @Override
    public ResponseEntity<CreateEmployeeResponse> saveEmployee(Employee employee) throws GlobalException {
        insertEmployeeUseCase.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(CreateEmployeeResponse.builder().id(employee.getId()).build());
    }

    @Override
    public ResponseEntity<Void> update(Employee employee) throws GlobalException {
        updateEmployeeUseCase.updateEmployee(employee);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    public ResponseEntity<Void> deleteEmployee(String id) throws GlobalException {
        deleteEmployeeUseCase.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
