package ru.liga.pattern.task5.entity;

import java.math.BigDecimal;

public class ScoringEngine {
    ScoringStrategy strategy;

    public ScoringEngine(ScoringStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Нам нужно согласовать заявку на кредит. У нас есть скоринговый движок, который должен уметь считать скоринг по-разному.
     * При этом мы хотим дать возможность клиентскому коду самому выбирать, какой вариант скоринга использовать.
     * <p>
     * Задача: Реализовать три варианта скоринга.
     * Выдавать все кредиты до 10 000 (включительно).
     * Для Vip-клиентов (VIP-клиент - это клиент с именем Борис) выдавать кредит всегда
     * Для Амины выдавать кредиты, если сумма в диапазоне [11000..15000]
     * <p>
     * Сделать так, чтобы при добавление новых вариантов не нужно было менять ScoringEngine
     * <p>
     * ScoringEngineTest - тесты. Тесты менять нельзя. Интерфейс вызова тоже.
     */
    public boolean score(String name, BigDecimal sum) {
        return strategy.score(sum);
    }
}
