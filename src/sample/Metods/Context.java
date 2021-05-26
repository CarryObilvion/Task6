package sample.Metods;

import java.util.Arrays;

/*
 * Класс, играющий роль модели или использования
 * Стратегии в конекретной задаче
 */

public class Context {
    private Strategy strategy;
    public int[] array;
    public String arrStr;
    public Context(Strategy strategy) {

        this.strategy = strategy;
    }
    public void sortArray(int[] array) {
        strategy.sort(array);
        System.out.println(Arrays.toString(array));
        arrStr = Arrays.toString(array);
        arrStr = Arrays.toString(array);
    }

    public String getArray()
    {
        return arrStr;
    }
}