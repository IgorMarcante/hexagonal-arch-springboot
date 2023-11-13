package io.github.igormarcante.hexagonalarch.common.config;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.*;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.*;
import io.github.igormarcante.hexagonalarch.domain.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    GetEmployeeUseCase getEmployeeService(GetEmployeePort getEmployeeAdapter) {
        return new GetEmployeeService(getEmployeeAdapter);
    }

    @Bean
    GetEmployeesUseCase getEmployeesService(GetEmployeesPort getEmployeesAdapter) {
        return new GetEmployeesService(getEmployeesAdapter);
    }

    @Bean
    InsertEmployeeUseCase insertEmployeeService(InsertEmployeePort insertEmployeeAdapter, ArgumentChecker existEmployeeChecker) {
        return new InsertEmployeeService(insertEmployeeAdapter, existEmployeeChecker);
    }
    @Bean
    DeleteEmployeeUseCase deleteEmployeeService(DeleteEmployeePort deleteEmployeeAdapter, ArgumentChecker notExistEmployeeChecker) {
        return new DeleteEmployeeService(deleteEmployeeAdapter, notExistEmployeeChecker);
    }
    @Bean
    UpdateEmployeeUseCase updateEmployeeService(UpdateEmployeePort updateEmployeeAdapter, ArgumentChecker notExistEmployeeChecker) {
        return new UpdateEmployeeService(updateEmployeeAdapter, notExistEmployeeChecker);
    }
}
