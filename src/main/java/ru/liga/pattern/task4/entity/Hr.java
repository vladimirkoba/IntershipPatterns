package ru.liga.pattern.task4.entity;

import ru.liga.pattern.task4.TransferListener;

import java.util.ArrayList;
import java.util.List;

public class Hr {
    public List<TransferListener> transferListener = new ArrayList<>();

    public void transferEmployee(Employee employee, Department oldDept, Department newDept) {
        System.out.println("Сотрудник " + employee.getFio() +
                " переведен из отдела " + oldDept.getName() + " в отдел " + newDept.getName());

        transferListener.forEach(t -> t.onTransfered(employee.getFio()));
    }

    public void addTransferListener(TransferListener transferListener) {
        this.transferListener.add(transferListener);
    }
}
