package io.gimo.algorithm.sort;

import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(10, 0, 30);
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}