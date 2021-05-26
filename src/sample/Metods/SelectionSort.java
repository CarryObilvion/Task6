package sample.Metods;

public class SelectionSort implements Strategy {
    /*
     * Данная сортировка заключается в поиске минимального элемента и обмена его с
     * первым элементом. Далее ищется следующий по величине элемент и
     * меняется с находящимся на второй позиции массива.
     */
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;

        }
    }
}