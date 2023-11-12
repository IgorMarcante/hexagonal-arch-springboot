package io.github.igormarcante.hexagonalarch.common.config;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.DeleteEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.GetEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.inbound.InsertEmployeeUseCase;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.DeleteEmployeePort;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.InsertEmployeePort;
import io.github.igormarcante.hexagonalarch.domain.service.DeleteEmployeeService;
import io.github.igormarcante.hexagonalarch.domain.service.GetEmployeeService;
import io.github.igormarcante.hexagonalarch.domain.service.InsertEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    GetEmployeeUseCase getEmployeeService(GetEmployeePort getEmployeeAdapter) {return new GetEmployeeService(getEmployeeAdapter);}

    @Bean
    InsertEmployeeUseCase insertEmployeeService(InsertEmployeePort insertEmployeeAdapter, ArgumentChecker existEmployeeChecker) {
        return new InsertEmployeeService(insertEmployeeAdapter, existEmployeeChecker);}

    @Bean
    DeleteEmployeeUseCase deleteEmployeeService(DeleteEmployeePort deleteEmployeeAdapter) {return new DeleteEmployeeService(deleteEmployeeAdapter);}
}
