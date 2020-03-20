package ru.liga.pattern.task5;

import ru.liga.pattern.task5.entity.ScoringStrategy;

import java.math.BigDecimal;

public class AminaStrategy implements ScoringStrategy {
    @Override
    public boolean score(BigDecimal sum) {
        if (sum.doubleValue() >= 11000 && sum.doubleValue() <= 15000)
            return true;
        return false;
    }
}
