package ru.liga.pattern.task8;

import ru.liga.pattern.task8.entity.CreditSolution;

public class ScoringAdditionalHandler {
    private final CreditSolution creditSolution;

    public ScoringAdditionalHandler(CreditSolution creditSolution) {
        this.creditSolution = creditSolution;
    }

    public void anotherHandling() {
        System.out.println("Another handling for CreditSolution");
        System.out.println(creditSolution);
    }
}
