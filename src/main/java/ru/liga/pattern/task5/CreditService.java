package ru.liga.pattern.task5;

import ru.liga.pattern.task5.entity.ScoringEngine;
import ru.liga.pattern.task5.entity.ScoringStrategy;

import java.math.BigDecimal;

public class CreditService {


    public boolean isThisManEnoughGoodForCredit(String name, BigDecimal sum) {
        // Вот это клиентский код. Тут нужно управлять вариантами расчета скоринга.
        ScoringStrategy strategy = chooseYourStrategy(name);
        ScoringEngine engine = new ScoringEngine(strategy);

        return engine.score(name, sum);
    }

    private ScoringStrategy chooseYourStrategy(String name) {
        if (name.equals("Амина")) {
            return new AminaStrategy();
        }
        if (name.equals("Борис")) {
            return new VipStrategy();
        }
        return new DefaultStrategy();
    }
}