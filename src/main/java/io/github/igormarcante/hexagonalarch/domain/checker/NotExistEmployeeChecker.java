package io.github.igormarcante.hexagonalarch.domain.checker;

import io.github.igormarcante.hexagonalarch.domain.exception.GlobalException;
import io.github.igormarcante.hexagonalarch.domain.exception.constants.ErrorConstant;
import io.github.igormarcante.hexagonalarch.domain.ports.outbound.GetEmployeePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NotExistEmployeeChecker implements ArgumentChecker{
    private final GetEmployeePort getEmployeePort;
    @Override
    public void check(Object fieldValue) throws GlobalException {
        final String employee = fieldValue.toString();
        if(notExist(employee)){
            throw new GlobalException(ErrorConstant.NOT_FOUND_MESSAGE);
        }
    }

    private boolean notExist(String employee) {
        return !getEmployeePort.existsEmployee(employee);
    }
}
