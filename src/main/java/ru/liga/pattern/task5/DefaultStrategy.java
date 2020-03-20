package ru.liga.pattern.task5;

import ru.liga.pattern.task5.entity.ScoringStrategy;

import java.math.BigDecimal;

public class DefaultStrategy implements ScoringStrategy {
    @Override
    public boolean score(BigDecimal sum) {
        if (sum.doubleValue() <= 10000)
            return true;
        return false;
    }
}
