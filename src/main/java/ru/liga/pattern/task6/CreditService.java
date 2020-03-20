package ru.liga.pattern.task6;

import ru.liga.pattern.task6.lib.Scoring;
import ru.liga.pattern.task6.lib.SlowScoring;

import java.math.BigDecimal;

public class CreditService {

    /**
     * У нас есть класс взаимодействия с внешним скорингом. Класс библиотечный, менять мы его не можем.
     * Возникла проблема – скоринг работает медленно, а запросов с одинаковыми именами и суммами много.
     * Решение – добавить кэширование. (сохранять результаты расчета для одних и тех же имен и сумм и
     * если они уже рассчитывались - сразу возвращать их)
     *
     * Задача – не изменяя интерфейса, добавить кэширование в систему.
     */

    public static void main(String[] args) {
        // Должно отработать быстро
        Scoring slowScoring = new CacheScoring();

        System.out.println("Результат по Васе - " + slowScoring.scoring("Вася", new BigDecimal("5000")));
        System.out.println("Результат по Васе - " + slowScoring.scoring("Вася", new BigDecimal("5000")));
        System.out.println("Результат по Васе - " + slowScoring.scoring("Вася", new BigDecimal("5000")));
    }
}
