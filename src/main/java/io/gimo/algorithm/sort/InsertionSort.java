package io.gimo.algorithm.sort;

import io.gimo.algorithm.AlgoHelper;

public class InsertionSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                AlgoHelper.swap(arr, j - 1, j);
            }
        }
    }

    public static <T extends Comparable<T>> void sort2(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T aux = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(aux) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = aux;
        }
    }
}
