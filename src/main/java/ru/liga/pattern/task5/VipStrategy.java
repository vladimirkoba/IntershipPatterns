package ru.liga.pattern.task5;

import ru.liga.pattern.task5.entity.ScoringStrategy;

import java.math.BigDecimal;

public class VipStrategy implements ScoringStrategy {
    @Override
    public boolean score(BigDecimal sum) {
        return true;
    }

}
