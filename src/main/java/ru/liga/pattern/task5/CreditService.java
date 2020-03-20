package ru.liga.pattern.task5;

import ru.liga.pattern.task5.entity.ScoringEngine;

import java.math.BigDecimal;

public class CreditService {


    public boolean isThisManEnoughGoodForCredit(String name, BigDecimal sum) {
        // Вот это клиентский код. Тут нужно управлять вариантами расчета скоринга.
        ScoringEngine engine = new ScoringEngine();
        return engine.score(name, sum);
    }
}
