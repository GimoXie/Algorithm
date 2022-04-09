package io.gimo.algorithm.book;

import java.util.ArrayList;
import java.util.List;

// https://blog.csdn.net/Ares___/article/details/120395712
public class Coins {

    private List<Integer> answers = new ArrayList<>();

    public int coinChange(int[] coins, int amount) {
        // 题目要求的最终结果是 dp(amount)
        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {
        // base case
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }

        //初始化res为Integer中最大值
        int res = -1;
        for (int coin : coins) {
            // 计算子问题的结果
            int subProblem = dp(coins, amount - coin);
            // 子问题无解则跳过
            if (subProblem == -1) {
                continue;
            }
            // 在子问题中选择最优解，然后加一
            res = res == -1 ? subProblem + 1 : Math.min(res, subProblem + 1);
        }

        // 没有最优解，返回-1
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = amount + 1;
            for (int coin : coins) {
                if (i < coin) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Coins coins = new Coins();
        int[] coin = new int[]{1, 3, 5};
        for (int i = 0; i < 20; i++) {
            System.out.println(coins.coinChange2(coin, i) == coins.coinChange(coin, i));
        }
    }

}
