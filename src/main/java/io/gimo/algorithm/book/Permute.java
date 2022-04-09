package io.gimo.algorithm.book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute {

    private List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new LinkedList<>());
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track) {
        // 无决策可做的时候 返回
        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int num : nums) {
            if (track.contains(num)) {
                continue;
            }
            track.add(num);
            backtrack(nums, track);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permute permute = new Permute();
        System.out.println(permute.permute(nums));
    }
}
