package sample.Metods;



public class InsertionSort implements Strategy {
    /*
     * В данной сортировке элементы просматриваются по одному,
     * и каждый новый поступивший элемент размещается в подходящее место
     * среди ранее упорядоченных элементов
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