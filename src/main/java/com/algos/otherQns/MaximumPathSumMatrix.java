package com.algos.otherQns;

public class MaximumPathSumMatrix {
    public int findMaximumSumFalling(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        int max =Integer.MIN_VALUE;

        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i<1) dp[i][j] = grid[i][j];
                else {
                    if(j>0 && j<n-1)
                        dp[i][j] = grid[i][j]+ Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i-1][j+1]));
                    else if(j>0)
                        dp[i][j] = grid[i][j]+ Math.max(dp[i-1][j-1], dp[i-1][j]);
                    else
                        dp[i][j] = grid[i][j]+ Math.max(dp[i-1][j], dp[i-1][j+1]);
                }
                if(i==m-1){
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
