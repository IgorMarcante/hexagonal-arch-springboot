package io.github.igormarcante.hexagonalarch.infrastructure.mongo;

import io.github.igormarcante.hexagonalarch.domain.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    boolean existsByDocumentNumber(String documentNumber);
}
