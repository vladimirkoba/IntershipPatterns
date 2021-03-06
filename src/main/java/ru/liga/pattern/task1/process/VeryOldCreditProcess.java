package ru.liga.pattern.task1.process;

import ru.liga.pattern.task1.entity.CreditRequest;
import ru.liga.pattern.task1.entity.Employee;

public class VeryOldCreditProcess {
    public boolean result(CreditRequest creditRequest) {        // Очень упрощенно :)
        Employee approver = EmployeeSimpleFactory.createApprover(creditRequest.getSum());
        // Определить согласуюшего для подтверждения заявки
        return approver.checkCreditRequest(creditRequest);
    }
}
