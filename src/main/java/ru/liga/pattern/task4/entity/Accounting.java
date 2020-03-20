package ru.liga.pattern.task4.entity;

import ru.liga.pattern.task4.TransferListener;

public class Accounting implements TransferListener {
    /**
     * Когда Hr переводит сотрудника из отдела в отдел - должен напечатать на экране
     * «Для сотрудника $name переоформлены документы»
     */
    public void singDocuments(String name) {
        System.out.println("Для сотрудника " + name + " переоформлены документы");
    }

    @Override
    public void onTransfered(String name) {
        singDocuments(name);
    }
}
