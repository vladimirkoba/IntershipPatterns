package ru.liga.pattern.task3;

import ru.liga.pattern.task3.entity.Director;
import ru.liga.pattern.task3.entity.Manager;
import ru.liga.pattern.task3.entity.SeniorManager;

public class Main {

    /**
     * В методе void work() должны последовательно вызываться три метода:
     *
     *   void takeTask() - пишет на экран "Задача взята"
     *   void performTask() - пишет на экран "Задача в работе"
     *   void signTask() - пишет на экран "Задача выполнена. %Роль исполняюего%. Роль исполняюего зависит от класса"
     *
     *   takeTask и performTask одинаковы для всех классов и будущих наследников. Подпись отличается.
     *
     * */
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();

        SeniorManager seniorManager = new SeniorManager();
        seniorManager.work();

        Director director = new Director();
        director.work();
    }
}
