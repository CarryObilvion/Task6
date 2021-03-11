package sample.Metods;
/**
 * Класс, включающий в себя метод сортировки "Пузырьком"
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.3
 */
public class BubbleSort implements Strategy {
    /**
     * Данная сортировка заключается в попарном сравнении
     * соседних элементов, при неправильной последовательности данные
     * элементы меняются местами.
     */
    @Override
    public void sort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
