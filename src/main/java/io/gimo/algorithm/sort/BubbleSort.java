package io.gimo.algorithm.sort;

import io.gimo.algorithm.AlgoHelper;

public class BubbleSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    AlgoHelper.swap(arr, j, j + 1);
                }
            }
        }
    }
}
