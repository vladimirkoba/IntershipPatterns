package ru.liga.pattern.task1.process;

import ru.liga.pattern.task1.entity.Director;
import ru.liga.pattern.task1.entity.Employee;
import ru.liga.pattern.task1.entity.Manager;
import ru.liga.pattern.task1.entity.SeniorManager;

import java.math.BigDecimal;

public class EmployeeSimpleFactory {
    public static Employee createApprover(BigDecimal sum) {
        if (sum.compareTo(new BigDecimal("10000")) < 0) {
            return new Manager();
        }
        if (sum.compareTo(new BigDecimal("50000")) <= 0) {
            return new SeniorManager();
        }
        return new Director();
    }
}
