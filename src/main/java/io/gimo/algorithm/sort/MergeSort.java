package io.gimo.algorithm.sort;

import java.lang.reflect.Array;

public class MergeSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] arr) {

        mergeSort(arr, 0, arr.length - 1);

    }

    private static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    @SuppressWarnings({"unchecked"})
    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {

        T[] aux = (T[]) Array.newInstance(arr.getClass().getComponentType(), right - left + 1);
        for (int i = left; i <= right; i++) {
            aux[i - left] = arr[i];
        }

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j - left];
                j++;
            } else if (j > right) {
                arr[k] = aux[i - left];
                i++;
            } else if (aux[i - left].compareTo(aux[j - left]) > 0) {
                arr[k] = aux[j - left];
                j++;
            } else {
                arr[k] = aux[i - left];
                i++;
            }
        }

    }


}
