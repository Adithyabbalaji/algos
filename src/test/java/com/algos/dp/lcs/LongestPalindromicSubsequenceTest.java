package com.algos.dp.lcs;

public final class LongestPalindromicSubsequenceTest {
    private LongestPalindromicSubsequenceTest() {
    }

    public static void main(String[] args) {
        testClassicExample();
        testWithNoRepeatedCharacters();
        testWithEmptyString();

        System.out.println("All LPS tests passed.");
    }

    private static void testClassicExample() {
        int actual = LongestPalindromicSubsequence.length("BBABCBCAB");
        assertEquals(7, actual, "Classic LPS length should be 7");

        String seq = LongestPalindromicSubsequence.sequence("BBABCBCAB");
        assertEquals(7, seq.length(), "Classic LPS sequence length should be 7");
        assertTrue(isPalindrome(seq), "Classic LPS sequence should be a palindrome");
    }

    private static void testWithNoRepeatedCharacters() {
        int actual = LongestPalindromicSubsequence.length("abcd");
        assertEquals(1, actual, "LPS with no repeated characters should be 1");

        String seq = LongestPalindromicSubsequence.sequence("abcd");
        assertEquals(1, seq.length(), "LPS sequence length should be 1");
        assertTrue(isPalindrome(seq), "Single-character LPS should be a palindrome");
    }

    private static void testWithEmptyString() {
        int actual = LongestPalindromicSubsequence.length("");
        assertEquals(0, actual, "LPS with empty string should be 0");

        String seq = LongestPalindromicSubsequence.sequence("");
        assertEquals("", seq, "LPS sequence with empty string should be empty");
    }

    private static boolean isPalindrome(String value) {
        int left = 0;
        int right = value.length() - 1;

        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }

    private static void assertEquals(String expected, String actual, String message) {
        if (!expected.equals(actual)) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
