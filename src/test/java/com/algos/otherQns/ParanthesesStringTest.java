package com.algos.otherQns;

public final class ParanthesesStringTest {
    private ParanthesesStringTest() {
    }

    public static void main(String[] args) {
        testAlreadyValidString();
        testExtraClosingParentheses();
        testExtraOpeningParentheses();
        testMixedWithLetters();
        testOnlyLetters();
        testBothMethodsReturnSameResult();

        System.out.println("All paranthesesString tests passed.");
    }

    private static void testAlreadyValidString() {
        ParanthesesString solver = new ParanthesesString();

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid("a(b)c");
        int minBySecondMethod = solver.minRemove("a(b)c");

        assertEquals(0, minByFirstMethod, "Valid string should require zero removals");
        assertEquals(0, minBySecondMethod, "Valid string should require zero removals");
    }

    private static void testExtraClosingParentheses() {
        ParanthesesString solver = new ParanthesesString();

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid("lee(t)cod(e))");
        int minBySecondMethod = solver.minRemove("lee(t)cod(e))");

        assertEquals(1, minByFirstMethod, "One extra closing parenthesis should require one removal");
        assertEquals(1, minBySecondMethod, "One extra closing parenthesis should require one removal");
    }

    private static void testExtraOpeningParentheses() {
        ParanthesesString solver = new ParanthesesString();

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid("((abc)");
        int minBySecondMethod = solver.minRemove("((abc)");

        assertEquals(1, minByFirstMethod, "One extra opening parenthesis should require one removal");
        assertEquals(1, minBySecondMethod, "One extra opening parenthesis should require one removal");
    }

    private static void testMixedWithLetters() {
        ParanthesesString solver = new ParanthesesString();

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid("a)b(c)d");
        int minBySecondMethod = solver.minRemove("a)b(c)d");

        assertEquals(1, minByFirstMethod, "String with one unmatched closing parenthesis should require one removal");
        assertEquals(1, minBySecondMethod, "String with one unmatched closing parenthesis should require one removal");
    }

    private static void testOnlyLetters() {
        ParanthesesString solver = new ParanthesesString();

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid("leetcode");
        int minBySecondMethod = solver.minRemove("leetcode");

        assertEquals(0, minByFirstMethod, "String with no parentheses should require zero removals");
        assertEquals(0, minBySecondMethod, "String with no parentheses should require zero removals");
    }

    private static void testBothMethodsReturnSameResult() {
        ParanthesesString solver = new ParanthesesString();
        String input = "())(()";

        int minByFirstMethod = solver.minParanthesesToRemoveToMakeItValid(input);
        int minBySecondMethod = solver.minRemove(input);

        assertEquals(2, minByFirstMethod, "Expected minimum removals should be two for input: " + input);
        assertEquals(minByFirstMethod, minBySecondMethod, "Both methods should return the same minimum removals");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }
}
