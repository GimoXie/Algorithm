package io.gimo.algorithm;

public class AlgoHelper {

    public static <T> void swap(T[] arr, int left, int right) {
        T aux = arr[right];
        arr[right] = arr[left];
        arr[left] = aux;
    }
}
