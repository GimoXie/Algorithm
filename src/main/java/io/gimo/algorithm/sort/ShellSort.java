package io.gimo.algorithm.sort;

public class ShellSort {

    public static <T extends Comparable<T>> void sort(T[] data) {
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                T temp = data[i];
                int j = i - increment;
                for (; j >= 0 && temp.compareTo(data[j]) < 0; j -= increment) {
                    data[j + increment] = data[j];
                }
                data[j + increment] = temp;
            }
        }
    }
}