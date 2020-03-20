package ru.liga.pattern.task5.entity;

import java.math.BigDecimal;

public interface ScoringStrategy {
    boolean score(BigDecimal sum);
}
