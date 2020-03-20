package ru.liga.pattern.task7;

import ru.liga.pattern.task7.lib.SlowScoring;

import java.math.BigDecimal;

public class CreditService {

    /**
     * У нас есть класс взаимодействия с внешним скорингом. Класс библиотечный, менять мы его не можем.
     * Скоринг считается долго, и поэтому надо:
     * - Знать, сколько он выполняется по времени (напечатать время выполнения на экран)
     * - Если он уже считался для конкретного человека с конкретными параметрами – заново не считать (вернуть закешированный результат)
     * - Логгировать факт скоринга (System.out будет достаточно)
     * <p>
     * Самое интересное, что клиент сам выбирает, что делать с конкретным вызовом скоринга –
     * где-то хватит логирования, а где-то нужно всё вместе.
     */

    public static void main(String[] args) {
        // Домен такой же, как и в предыдущей задачи
        // Сделать три вызова скоринга:
        //  - Скоринг дополнительно только измеряет время, не логгируя ничего дополнительного и не кэшируя
        //  - Скоринг кэширует и логгирует, но не пишет время
        //  - Скоринг логирует, кэширует и пишет
        new ScoringTime(
                new SlowScoring())
                .scoring("", BigDecimal.TEN);

        LogScoring logScoring = new LogScoring(
                new CachedScoring(
                        new SlowScoring()));

        logScoring.scoring("", BigDecimal.TEN);
        logScoring.scoring("", BigDecimal.TEN);
        logScoring.scoring("", BigDecimal.TEN);

        new ScoringTime(
                logScoring)
                .scoring("", BigDecimal.TEN);

    }
}
