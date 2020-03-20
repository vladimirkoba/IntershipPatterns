package ru.liga.pattern.task5.entity;

import org.junit.Test;
import ru.liga.pattern.task5.CreditService;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ScoringEngineTest {
    @Test
    public void petrTest() {
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Петр", BigDecimal.ONE));
        assertFalse(new CreditService().isThisManEnoughGoodForCredit("Петр", new BigDecimal("20000")));
    }

    @Test
    public void borisTest() {
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Борис", BigDecimal.ONE));
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Борис", new BigDecimal("20000")));
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Борис", new BigDecimal("20000000")));
    }

    @Test
    public void aminaTest() {
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Амина", BigDecimal.ONE));
        assertTrue(new CreditService().isThisManEnoughGoodForCredit("Амина", new BigDecimal("13000")));
        assertFalse(new CreditService().isThisManEnoughGoodForCredit("Амина", new BigDecimal("20000000")));
    }

}