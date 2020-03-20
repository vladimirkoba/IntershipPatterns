package ru.liga.pattern.task8.external;

import ru.liga.pattern.task8.entity.NewCreditSolution;

import java.math.BigDecimal;
import java.util.Random;

public class ScoringSystem {

    public NewCreditSolution scoringResult(String name, BigDecimal sum) {
        return new NewCreditSolution(new Random(10).nextInt());
    }
}
