package com.algos.dp.lcs;

public final class LongestCommonSubsequenceTest {
    private LongestCommonSubsequenceTest() {
    }

    public static void main(String[] args) {
        testClassicExample();
        testWithNoCommonSubsequence();
        testWithEmptyString();
        testSequenceMatchesExpectedLength();

        System.out.println("All LCS tests passed.");
    }

    private static void testClassicExample() {
        int actual = LongestCommonSubsequence.length("AGGTAB", "GXTXAYB");
        assertEquals(4, actual, "Classic LCS length should be 4");

        String seq = LongestCommonSubsequence.sequence("AGGTAB", "GXTXAYB");
        assertEquals("GTAB", seq, "Classic LCS sequence should be GTAB");
    }

    private static void testWithNoCommonSubsequence() {
        int actual = LongestCommonSubsequence.length("abc", "def");
        assertEquals(0, actual, "No common subsequence should return 0");

        String seq = LongestCommonSubsequence.sequence("abc", "def");
        assertEquals("", seq, "No common subsequence should return empty string");
    }

    private static void testWithEmptyString() {
        int actual = LongestCommonSubsequence.length("", "abcdef");
        assertEquals(0, actual, "LCS with empty string should return 0");

        String seq = LongestCommonSubsequence.sequence("", "abcdef");
        assertEquals("", seq, "LCS sequence with empty string should return empty");
    }

    private static void testSequenceMatchesExpectedLength() {
        String first = "ABCDGH";
        String second = "AEDFHR";
        String seq = LongestCommonSubsequence.sequence(first, second);
        int length = LongestCommonSubsequence.length(first, second);

        assertEquals(3, length, "LCS length should be 3");
        assertEquals(length, seq.length(), "Sequence length should match computed LCS length");
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
}
