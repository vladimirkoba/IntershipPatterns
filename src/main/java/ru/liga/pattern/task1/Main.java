package ru.liga.pattern.task1;

import ru.liga.pattern.task1.entity.CreditRequest;
import ru.liga.pattern.task1.process.NewCreditProcess;
import ru.liga.pattern.task1.process.OldCreditProcess;
import ru.liga.pattern.task1.process.VeryOldCreditProcess;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        VeryOldCreditProcess veryOldCreditProcess = new VeryOldCreditProcess();
        veryOldCreditProcess.result(new CreditRequest("Иванов", new BigDecimal("10.00")));

        OldCreditProcess oldCreditProcess = new OldCreditProcess();
        oldCreditProcess.result(new CreditRequest("Иванов", new BigDecimal("102343.00")));

        NewCreditProcess newCreditProcess = new NewCreditProcess();
        newCreditProcess.result(new CreditRequest("Василий", new BigDecimal("50000.00")));
    }
}
