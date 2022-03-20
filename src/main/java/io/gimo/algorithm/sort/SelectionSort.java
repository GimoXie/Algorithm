package io.gimo.algorithm.sort;

import io.gimo.algorithm.AlgoHelper;

/**
 * 选择排序
 * 从当前元素开始 找出最小的元素和当前元素交换位置
 * @param <T>
 */
public class SelectionSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                AlgoHelper.swap(arr, minIndex, i);
            }
        }
    }

}
