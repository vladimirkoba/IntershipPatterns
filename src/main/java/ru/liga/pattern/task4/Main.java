package ru.liga.pattern.task4;

import ru.liga.pattern.task4.entity.*;

public class Main {

    /**
     * Сотрудник переходит из одного отдела в другой. Этот перевод осуществляет отдел кадров.
     * Об этом нужно узнать бухгалтерии и отделу поддержки.  Позже могут появиться другие отделы,
     * для которых это событие важно.
     * <p>
     * Придумайте структуру, в которой будет легко реализовать такую логику.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Для решения задачи main можно менять!
        Hr hr = new Hr();

        hr.addTransferListener(new Accounting());
        hr.addTransferListener(new ServiceDesk());

        hr.transferEmployee(new Employee("Vasya"),
                new Department("old"),
                new Department("new"));
    }
}
