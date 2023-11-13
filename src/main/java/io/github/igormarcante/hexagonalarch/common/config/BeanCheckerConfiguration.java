package io.github.igormarcante.hexagonalarch.common.config;

import io.github.igormarcante.hexagonalarch.domain.checker.ArgumentChecker;
import io.github.igormarcante.hexagonalarch.domain.checker.ExistEmployeeChecker;
import io.github.igormarcante.hexagonalarch.domain.checker.NotExistEmployeeChecker;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCheckerConfiguration {
    @Bean
    ArgumentChecker existEmployeeChecker(GetEmployeePort getEmployeeAdapter) {return new ExistEmployeeChecker(getEmployeeAdapter);}
    @Bean
    ArgumentChecker notExistEmployeeChecker(GetEmployeePort getEmployeeAdapter) {return new NotExistEmployeeChecker(getEmployeeAdapter);}
}
