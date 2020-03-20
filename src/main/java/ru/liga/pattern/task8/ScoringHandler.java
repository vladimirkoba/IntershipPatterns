package ru.liga.pattern.task8;

import ru.liga.pattern.task8.entity.CreditSolution;
import ru.liga.pattern.task8.entity.NewCreditSolution;

public class ScoringHandler {
    private final CreditSolution creditSolution;

    public ScoringHandler(CreditSolution creditSolution) {
        this.creditSolution = creditSolution;
    }

    public void handleSolution(){
        System.out.println(creditSolution);
        new ScoringAdditionalHandler(creditSolution).anotherHandling();
    }
}
