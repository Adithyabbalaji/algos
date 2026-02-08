package com.algos.dp.lcs;

/**
 * Dynamic Programming solution for Longest Palindromic Subsequence (LPS)
 * built on top of Longest Common Subsequence (LCS) logic.
 */
public final class LongestPalindromicSubsequence {
    private LongestPalindromicSubsequence() {
        // Utility class; prevent instantiation.
    }

    /**
     * Returns the LPS length by computing LCS between the input and its reverse.
     */
    public static int length(String input) {
        validateInput(input);

        String reversed = new StringBuilder(input).reverse().toString();
        return LongestCommonSubsequence.length(input, reversed);
    }

    /**
     * Returns one valid LPS sequence by computing LCS between the input and its reverse.
     */
    public static String sequence(String input) {
        validateInput(input);

        String reversed = new StringBuilder(input).reverse().toString();
        return LongestCommonSubsequence.sequence(input, reversed);
    }

    private static void validateInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }
    }
}
