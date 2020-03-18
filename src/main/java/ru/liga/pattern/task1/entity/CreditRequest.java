package ru.liga.pattern.task1.entity;

import java.math.BigDecimal;

public class CreditRequest{
    private final String fio;
    private final BigDecimal sum;

    public CreditRequest(String fio, BigDecimal sum) {
        this.fio = fio;
        this.sum = sum;
    }

    public String getFio() {
        return fio;
    }

    public BigDecimal getSum() {
        return sum;
    }
}
