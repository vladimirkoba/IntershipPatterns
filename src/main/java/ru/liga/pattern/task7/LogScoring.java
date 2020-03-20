package ru.liga.pattern.task7;

import ru.liga.pattern.task7.lib.Scoring;

import java.math.BigDecimal;

public class LogScoring implements Scoring {
    private final Scoring scoring;

    public LogScoring(Scoring slowScoring) {
        this.scoring = slowScoring;
    }

    @Override
    public boolean scoring(String name, BigDecimal sum) {
        System.out.println("SCORING LAUNCHED");
        return scoring.scoring(name, sum);
    }
}
