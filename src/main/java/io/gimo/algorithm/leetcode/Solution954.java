package io.gimo.algorithm.leetcode;

import java.util.*;

public class Solution954 {

    public boolean canReorderDoubled(int[] arr) {
        if (arr.length == 0 || arr.length % 2 != 0) {
            return false;
        }
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            map2.put(i, 2 * i);
        }
        for (int i : arr) {
            int key1 = i;
            int key2 = map2.get(i);

            if (map.getOrDefault(key1, -1) >0 && map.getOrDefault(key2, -1) > 0) {
                map.put(key1, map.get(key1) - 1);
                map.put(key2, map.get(key2) - 1);
            }
        }
        for (Integer value : map.values()) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Solution954 solution = new Solution954();
        int[] arr = {2, 4, 0, 0, 8, 1};
        //int[] arr = {2, 1, 2, 1, 1, 1, 2, 2};
        //int[] arr = {4,-2,2,-4};
        System.out.println(solution.canReorderDoubled(arr));
    }

}
