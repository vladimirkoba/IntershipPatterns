package ru.liga.pattern.task2.entity;

import java.math.BigDecimal;

public class CreditRequest {
    private final String fio;
    private final BigDecimal sum;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;
    private final String param6;
    private final String param7;

    public CreditRequest(String fio, BigDecimal sum, String param1, String param2, String param3, String param4, String param5, String param6, String param7) {
        this.fio = fio;
        this.sum = sum;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
        this.param7 = param7;
    }
}
