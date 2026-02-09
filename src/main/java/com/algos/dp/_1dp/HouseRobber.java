package com.algos.dp._1dp;

/**
 * Solutions for the classic House Robber problem.
 */
public class HouseRobber {
    public int robRecursive(int[] houses) {
        validateInput(houses);
        return robFromIndex(houses, houses.length - 1);
    }

    public int robDpArray(int[] houses) {
        validateInput(houses);

        if (houses.length == 0) {
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }

        int[] dp = new int[houses.length];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < houses.length; i++) {
            dp[i] = Math.max(dp[i - 1], houses[i] + dp[i - 2]);
        }

        return dp[houses.length - 1];
    }

    public int robConstantSpace(int[] houses) {
        validateInput(houses);

        int prevTwo = 0;
        int prevOne = 0;

        for (int amount : houses) {
            int current = Math.max(prevOne, amount + prevTwo);
            prevTwo = prevOne;
            prevOne = current;
        }

        return prevOne;
    }

    private int robFromIndex(int[] houses, int index) {
        if (index < 0) {
            return 0;
        }
        if (index == 0) {
            return houses[0];
        }

        int pick = houses[index] + robFromIndex(houses, index - 2);
        int skip = robFromIndex(houses, index - 1);

        return Math.max(pick, skip);
    }

    private void validateInput(int[] houses) {
        if (houses == null) {
            throw new IllegalArgumentException("Input houses must not be null");
        }
    }
}
