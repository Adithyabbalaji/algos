package com.algos.dp._1dp;

public final class HouseRobber2Test {
    private HouseRobber2Test() {
    }

    public static void main(String[] args) {
        testClassicCircularExample();
        testAnotherCircularExample();
        testSingleHouse();
        testTwoHouses();
        testEmptyInputThrows();

        System.out.println("All HouseRobber2 tests passed.");
    }

    private static void testClassicCircularExample() {
        HouseRobber2 solver = new HouseRobber2();
        int[] houses = {2, 3, 2};

        int actual = solver.rob(houses);
        assertEquals(3, actual, "Circular classic example should return 3");
    }

    private static void testAnotherCircularExample() {
        HouseRobber2 solver = new HouseRobber2();
        int[] houses = {1, 2, 3, 1};

        int actual = solver.rob(houses);
        assertEquals(4, actual, "Best non-adjacent circular robbery should return 4");
    }

    private static void testSingleHouse() {
        HouseRobber2 solver = new HouseRobber2();
        int[] houses = {7};

        int actual = solver.rob(houses);
        assertEquals(7, actual, "Single-house input should return that house value");
    }

    private static void testTwoHouses() {
        HouseRobber2 solver = new HouseRobber2();
        int[] houses = {9, 5};

        int actual = solver.rob(houses);
        assertEquals(9, actual, "Two-house circular case should return the max value");
    }

    private static void testEmptyInputThrows() {
        HouseRobber2 solver = new HouseRobber2();

        assertThrows(NegativeArraySizeException.class, () -> solver.rob(new int[]{}),
                "Empty input should currently throw due to array sizing in implementation");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }

    private static void assertThrows(Class<? extends Throwable> expected, Runnable runnable, String message) {
        try {
            runnable.run();
            throw new AssertionError(message + ". Expected exception: " + expected.getSimpleName());
        } catch (Throwable throwable) {
            if (!expected.isInstance(throwable)) {
                throw new AssertionError(message + ". Expected exception: " + expected.getSimpleName()
                        + ", actual: " + throwable.getClass().getSimpleName());
            }
        }
    }
}
