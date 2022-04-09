package io.gimo.algorithm.leetcode;

public class Solution796 {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int length = goal.length();
        for (int i = 0; i < length; i++) {
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if (s.charAt((i + j) % length) != goal.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution796 solution796 = new Solution796();
        System.out.println(solution796.rotateString("abcde", "cdeab"));
    }

}