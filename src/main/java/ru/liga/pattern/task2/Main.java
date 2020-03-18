package ru.liga.pattern.task2;

import ru.liga.pattern.task2.entity.CreditRequest;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        CreditRequest request = CreditRequest.create("my fio", new BigDecimal("10"))
                .setParam1("asdf")
                .setParam2("akhkgh3")
                .build();

        System.out.println(request);

    }
}
