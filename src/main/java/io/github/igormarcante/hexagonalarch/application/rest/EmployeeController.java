package io.github.igormarcante.hexagonalarch.application.rest;

import io.github.igormarcante.hexagonalarch.application.rest.response.CreateEmployeeResponse;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.GetEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.InsertEmployeeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController implements EmployeeRestClient {
    private final GetEmployeeUseCase getEmployeeUseCase;
    private final InsertEmployeeUseCase insertEmployeeUseCase;

    @Override
    public ResponseEntity<Optional<Employee>> getEmployees(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(getEmployeeUseCase.getEmployee(id));
    }

    @Override
    public ResponseEntity<CreateEmployeeResponse> saveEmployee(Employee employee) throws GlobalException {
        insertEmployeeUseCase.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(CreateEmployeeResponse.builder().id(employee.getId()).build());
    }
}
