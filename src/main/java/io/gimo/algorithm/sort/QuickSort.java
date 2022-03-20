package io.gimo.algorithm.sort;

import io.gimo.algorithm.AlgoHelper;

public class QuickSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] arr) {

        quickSort(arr, 0, arr.length - 1);

    }

    private static <T extends Comparable<T>> void quickSort(T[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // partition满足 arr[left ... partition - 1] < arr[partition] < arr[partition + 1 ... right]
        int partition = partition(arr, left, right);

        // 快排partition左边的数组 arr[left ... partition - 1]
        quickSort(arr, left, partition - 1);

        // 快排partition右边的数组 arr[partition + 1 ... right]
        quickSort(arr, partition + 1, right);
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int left, int right) {
        // 以 left ... right区间内第一个元素为基准寻找partition值
        T v = arr[left];
        // 索引值小于j的元素都小于v
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(v) < 0) {
                AlgoHelper.swap(arr, i, j + 1);
                j++;
            }
        }
        // 找到符合要求的partition位置后，交换arr[partition] 和 arr[left] 使数组满足要求
        AlgoHelper.swap(arr, left, j);
        return j;
    }


}
