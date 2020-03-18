package ru.liga.pattern.task3.entity;

public abstract class Employee {

    public void work() {
        takeTask();
        performTask();
        signTask();
    }

    public void takeTask() {
        System.out.println("взяли");
    }

    public void performTask() {
        System.out.println("сделали");
    }

    abstract void signTask();
}
