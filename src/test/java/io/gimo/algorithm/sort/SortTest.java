package io.gimo.algorithm.sort;

import io.gimo.algorithm.AlgoHelper;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        Integer[] arr = AlgoHelper.generateRandomArray(10, 0, 30);
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
