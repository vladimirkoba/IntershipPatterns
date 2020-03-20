package ru.liga.pattern.task7;

import ru.liga.pattern.task7.lib.Scoring;

import java.math.BigDecimal;

public class ScoringTime implements Scoring {
    private final Scoring slowScoring;

    public ScoringTime(Scoring slowScoring) {
        this.slowScoring = slowScoring;
    }

    @Override
    public boolean scoring(String name, BigDecimal sum) {
        long startMs = System.currentTimeMillis();
        try {
            return slowScoring.scoring(name, sum);
        } finally {
            System.out.println("DURATION: " + (System.currentTimeMillis() - startMs)+"MS");
        }
    }
}
