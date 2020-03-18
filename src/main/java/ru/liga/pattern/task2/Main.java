package ru.liga.pattern.task2;

import ru.liga.pattern.task2.entity.CreditRequest;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CreditRequest request = CreditRequest.create("fip", BigDecimal.ZERO)
                        .setSum(BigDecimal.ZERO)
                        .setParam1("Param1")
                        .build();
    }
}
