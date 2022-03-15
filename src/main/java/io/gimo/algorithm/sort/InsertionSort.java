package io.gimo.algorithm.sort;

public class InsertionSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--) {
                T temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void sort2(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            for (; j > 0 && array[j - 1].compareTo(temp) > 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
