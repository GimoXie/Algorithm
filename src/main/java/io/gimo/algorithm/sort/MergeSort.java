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

        // 将已排序好的左右两边的数组进行合并
        merge(arr, left, mid, right);
    }

    @SuppressWarnings({"unchecked"})
    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {

        // 复制一份临时数组 用于比较左右半边的值进行归并
        T[] aux = (T[]) Array.newInstance(arr.getClass().getComponentType(), right - left + 1);
        for (int i = left; i <= right; i++) {
            aux[i - left] = arr[i];
        }

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                // i > mid 说明左边的元素已经全部合并完毕了，只需要把右边的元素合并回原数组
                arr[k] = aux[j - left];
                j++;
            } else if (j > right) {
                // j > right 说明右边元素都已经全部合并完毕了，只需要把左边的元素合并回原数组
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
