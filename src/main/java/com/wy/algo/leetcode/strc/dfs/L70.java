package com.wy.algo.leetcode.strc.dfs;

/**
 * @author ZhangYuYang
 * @since 2026/6/15 08:40
 */
public class L70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int f1 = 1;
        int f2 = 2;
        for (int i = 3; i <= n; i++) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f2;
    }

    public int climbStairsWithMemory(int n, int[] memoryArray) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (memoryArray[n] != 0) {
            return memoryArray[n];
        }

        memoryArray[n] = climbStairs(n-1) + climbStairs(n-2);
        return memoryArray[n];
    }
}
