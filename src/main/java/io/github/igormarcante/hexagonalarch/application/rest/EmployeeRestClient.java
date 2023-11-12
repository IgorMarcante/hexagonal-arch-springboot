package io.github.igormarcante.hexagonalarch.application.rest;

import io.github.igormarcante.hexagonalarch.application.rest.response.CreateEmployeeResponse;
import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/v1/employees")
public interface EmployeeRestClient {
    @GetMapping("/{id}")
    ResponseEntity<Optional<Employee>> getEmployees(@PathVariable("id") String id);

    @PostMapping()
    ResponseEntity<CreateEmployeeResponse> saveEmployee(@RequestBody Employee employee) throws GlobalException;
}
