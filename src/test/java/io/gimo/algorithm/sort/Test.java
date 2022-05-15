package io.gimo.algorithm.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    private List<List<Integer>> res = new ArrayList<>();

    public void process() {
        backtrack(new LinkedList<>());
        System.out.println();
    }

    private void backtrack(LinkedList<Integer> list) {
        if (list.size() == arr.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i : arr) {
            list.add(i);
            backtrack(list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.process();
    }
}
