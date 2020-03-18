package ru.liga.pattern.task4.entity;

import ru.liga.pattern.task4.TransferListener;

public class ServiceDesk implements TransferListener {
    /**
     * Когда Hr переводит сотрудника из отдела в отдел - должен напечатать на экране
     * «Для сотрудника $name переоформлены железки»
     */
    public void giveLaptop(String name) {
        System.out.println("Для сотрудника " + name + " переоформлены железки");
    }

    @Override
    public void onTransfered(String name) {
        giveLaptop(name);
    }
}
