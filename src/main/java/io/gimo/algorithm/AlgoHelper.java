package io.gimo.algorithm;

public class AlgoHelper {

    public static <T> void swap(T[] arr, int left, int right) {
        T aux = arr[right];
        arr[right] = arr[left];
        arr[left] = aux;
    }

    public static Integer[] generateRandomArray(int length, int min, int max) {
        Integer[] arr = new Integer[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        return arr;
    }
}
