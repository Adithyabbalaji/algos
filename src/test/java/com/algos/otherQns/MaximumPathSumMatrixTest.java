package com.algos.otherQns;

public final class MaximumPathSumMatrixTest {
    private MaximumPathSumMatrixTest() {
    }

    public static void main(String[] args) {
        testSquareMatrix();
        testSingleRowMatrix();
        testSingleColumnMatrix();

        System.out.println("All MaximumPathSumMatrix tests passed.");
    }

    private static void testSquareMatrix() {
        MaximumPathSumMatrix solver = new MaximumPathSumMatrix();
        int[][] grid = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        int actual = solver.findMaximumSumFalling(grid);
        assertEquals(17, actual, "Maximum falling path sum should be 17");
    }

    private static void testSingleRowMatrix() {
        MaximumPathSumMatrix solver = new MaximumPathSumMatrix();
        int[][] grid = {
                {10, 3, 8, 7}
        };

        int actual = solver.findMaximumSumFalling(grid);
        assertEquals(10, actual, "Single row maximum should be the max element");
    }

    private static void testSingleColumnMatrix() {
        MaximumPathSumMatrix solver = new MaximumPathSumMatrix();
        int[][] grid = {
                {3},
                {5},
                {9}
        };

        int actual = solver.findMaximumSumFalling(grid);
        assertEquals(17, actual, "Single column should be cumulative sum");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", actual: " + actual);
        }
    }
}
