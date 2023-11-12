package io.github.igormarcante.hexagonalarch.domain.checker;

import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.exception.constants.ErrorConstant;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExistEmployeeChecker implements ArgumentChecker{
    private final GetEmployeePort getEmployeePort;
    @Override
    public void check(Object fieldValue) throws GlobalException {
        final String employee = fieldValue.toString();
        if(exist(employee)){
            throw new GlobalException(ErrorConstant.EXISTING_EMPLOYEE_MESSAGE);
        }
    }

    private boolean exist(String employee) {
        return getEmployeePort.existsEmployee(employee);
    }
}
