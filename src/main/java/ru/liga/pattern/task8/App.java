package ru.liga.pattern.task8;

import ru.liga.pattern.task5.entity.ScoringEngine;
import ru.liga.pattern.task7.lib.Scoring;
import ru.liga.pattern.task8.entity.CreditSolution;
import ru.liga.pattern.task8.external.ScoringSystem;

import java.math.BigDecimal;

public class App {

    /**
     * У нас есть интеграция с внешней системой скоринга. Раньше она присылала объект
     * CreditSolution(boolean canGiveMoney, int rate). Внезапно, интерфейс изменился, и теперь внешняя система
     * возвращает NewCreditSolution(int rate).
     * <p>
     * Логика следующая:
     * Если rate = 0, то считаем, что кредит давать не надо.
     * <p>
     * А в коде-то везде CreditSolution.
     * <p>
     * Задача - минимальными изменениями привести код в работающие состояние
     *
     * @param args
     */


    public static void main(String[] args) {
        // Раскомментить и сделать, чтобы работало

//        ScoringSystem scoringSystem = new ScoringSystem();
//        CreditSolution creditSolution = scoringSystem.scoringResult("Vasya", BigDecimal.ZERO);
//        ScoringHandler scoringHandler = new ScoringHandler(creditSolution);
    }
}
