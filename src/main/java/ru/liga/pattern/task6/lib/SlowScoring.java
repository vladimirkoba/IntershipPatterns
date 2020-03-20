package ru.liga.pattern.task6.lib;

import java.math.BigDecimal;

public class SlowScoring implements Scoring {


    @Override
    public boolean scoring(String name, BigDecimal sum) {
        try {
            Thread.sleep(3000L);
            if (sum.longValue() <= 10000) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
