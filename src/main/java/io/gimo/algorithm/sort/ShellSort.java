package io.gimo.algorithm.sort;

public class ShellSort {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int increment = arr.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < arr.length; i++) {
                T aux = arr[i];
                int j = i - increment;
                for (; j >= 0 && aux.compareTo(arr[j]) < 0; j -= increment) {
                    arr[j + increment] = arr[j];
                }
                arr[j + increment] = aux;
            }
        }
    }
}