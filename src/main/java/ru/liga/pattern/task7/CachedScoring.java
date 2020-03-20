package ru.liga.pattern.task7;

import ru.liga.pattern.task7.lib.Scoring;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CachedScoring implements Scoring {
    private final Scoring scoring;
    private final Map<String, Boolean> cache;

    public CachedScoring(Scoring slowScoring) {
        this.scoring = slowScoring;
        cache = new HashMap<>();

    }

    @Override
    public boolean scoring(String name, BigDecimal sum) {
        String key = name + sum.toString();
        if (!cache.containsKey(key)) {
            boolean scoring = this.scoring.scoring(name, sum);
            cache.put(key, scoring);
        }
        return cache.get(key);

    }
}
