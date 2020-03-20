package ru.liga.pattern.task6;

import ru.liga.pattern.task6.lib.Scoring;
import ru.liga.pattern.task6.lib.SlowScoring;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CacheScoring implements Scoring {
    private final Scoring scoring;
    private final Map<String, Boolean> cache;

    public CacheScoring() {
        scoring = new SlowScoring();
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
