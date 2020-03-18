package ru.liga.pattern.task4.entity;

public class Hr {

    public void transferEmployee(Employee employee, Department oldDept, Department newDept) {
        System.out.println("Сотрудник " + employee.getFio() +
                " переведен из отдела " + oldDept.getName() + " в отдел " + newDept.getName());
    }
}
