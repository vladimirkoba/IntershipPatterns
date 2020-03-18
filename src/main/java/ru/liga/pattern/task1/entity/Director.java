package ru.liga.pattern.task1.entity;

public  class Director extends Employee {
    public boolean checkCreditRequest(CreditRequest creditRequest){
        System.out.println(this.getClass().toString());
        return true;
    };
}
