package io.gimo.algorithm.sort;

public final class SortTestHelper {

    public static Integer[] generateRandomArray(int length, int min, int max) {
        Integer[] arr = new Integer[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        return arr;
    }

}
