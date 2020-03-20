package ru.liga.pattern.task8.entity;

public class CreditSolution {
    private boolean canGiveMoney;
    private int rate;

    public CreditSolution(boolean canGiveMoney, int rate) {
        this.canGiveMoney = canGiveMoney;
        this.rate = rate;
    }

    public boolean canGiveMoney() {
        return canGiveMoney;
    }

    public int getRate() {
        return rate;
    }
}
