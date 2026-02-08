package com.algos.dp.lcs;

/**
 * Dynamic Programming solution for Longest Common Subsequence (LCS).
 */
public final class LongestCommonSubsequence {
    private LongestCommonSubsequence() {
        // Utility class; prevent instantiation.
    }

    /**
     * Returns the LCS length of two strings using bottom-up DP.
     */
    public static int length(String first, String second) {
        validateInputs(first, second);

        int m = first.length();
        int n = second.length();
        int[][] dp = buildDpTable(first, second);
        return dp[m][n];
    }

    /**
     * Returns one valid LCS string between two inputs.
     */
    public static String sequence(String first, String second) {
        validateInputs(first, second);

        int[][] dp = buildDpTable(first, second);
        StringBuilder sb = new StringBuilder();

        int i = first.length();
        int j = second.length();

        while (i > 0 && j > 0) {
            if (first.charAt(i - 1) == second.charAt(j - 1)) {
                sb.append(first.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return sb.reverse().toString();
    }

    private static int[][] buildDpTable(String first, String second) {
        int m = first.length();
        int n = second.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp;
    }

    private static void validateInputs(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Input strings must not be null");
        }
    }
}
