package com.algos.otherQns;

public class MaximumPathSumMatrix {
    public int findMaximumSumFalling(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    int bestPrevious = dp[i - 1][j];
                    if (j > 0) {
                        bestPrevious = Math.max(bestPrevious, dp[i - 1][j - 1]);
                    }
                    if (j < n - 1) {
                        bestPrevious = Math.max(bestPrevious, dp[i - 1][j + 1]);
                    }
                    dp[i][j] = grid[i][j] + bestPrevious;
                }

                if(i == m - 1){
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
