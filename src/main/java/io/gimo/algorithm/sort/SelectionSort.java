package io.gimo.algorithm.sort;

/**
 * 选择排序
 * 从当前元素开始 找出最小的元素和当前元素交换位置
 * @param <T>
 */
public class SelectionSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minPos]) < 0) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                T temp = array[minPos];
                array[minPos] = array[i];
                array[i] = temp;
            }
        }
    }

}
