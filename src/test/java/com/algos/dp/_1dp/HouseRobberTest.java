package com.algos.dp._1dp;

public final class HouseRobberTest {
    private HouseRobberTest() {
    }

    public static void main(String[] args) {
        testClassicExample();
        testAnotherClassicExample();
        testSingleHouse();
        testEmptyInput();
        testAllMethodsMatch();

        System.out.println("All HouseRobber tests passed.");
    }

    private static void testClassicExample() {
        HouseRobber solver = new HouseRobber();
        int[] houses = {1, 2, 3, 1};

        assertEquals(4, solver.robRecursive(houses), "Recursive solution should return 4");
        assertEquals(4, solver.robDpArray(houses), "DP array solution should return 4");
        assertEquals(4, solver.robConstantSpace(houses), "Constant-space solution should return 4");
    }

    private static void testAnotherClassicExample() {
        HouseRobber solver = new HouseRobber();
        int[] houses = {2, 7, 9, 3, 1};

        assertEquals(12, solver.robRecursive(houses), "Recursive solution should return 12");
        assertEquals(12, solver.robDpArray(houses), "DP array solution should return 12");
        assertEquals(12, solver.robConstantSpace(houses), "Constant-space solution should return 12");
    }

    private static void testSingleHouse() {
        HouseRobber solver = new HouseRobber();
        int[] houses = {8};

        assertEquals(8, solver.robRecursive(houses), "Single house should return same value");
        assertEquals(8, solver.robDpArray(houses), "Single house should return same value");
        assertEquals(8, solver.robConstantSpace(houses), "Single house should return same value");
    }

    private static void testEmptyInput() {
        HouseRobber solver = new HouseRobber();
        int[] houses = {};

        assertEquals(0, solver.robRecursive(houses), "Empty input should return 0");
        assertEquals(0, solver.robDpArray(houses), "Empty input should return 0");
        assertEquals(0, solver.robConstantSpace(houses), "Empty input should return 0");
    }

    private static void testAllMethodsMatch() {
        HouseRobber solver = new HouseRobber();
        int[] houses = {2, 1, 1, 2, 10, 1, 2};

        int recursive = solver.robRecursive(houses);
        int arrayDp = solver.robDpArray(houses);
        int constantSpace = solver.robConstantSpace(houses);

        assertEquals(recursive, arrayDp, "Recursive and array-DP methods should match");
        assertEquals(arrayDp, constantSpace, "Array-DP and constant-space methods should match");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }
}
