package io.gimo.algorithm.leetcode;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
            j++;
        }
        return i + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int left = 0;
        for (int rigth = 1; rigth < nums.length; rigth++) {
            if (nums[rigth] != nums[left]) {
                nums[++left] = nums[rigth];
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution26 solution26 = new Solution26();
        solution26.removeDuplicates2(nums);
    }

}
