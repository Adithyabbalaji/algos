package com.algos.arrays;

import java.lang.reflect.Constructor;

public final class ArraysPackageInfoTest {
    private ArraysPackageInfoTest() {
    }

    public static void main(String[] args) throws Exception {
        Constructor<ArraysPackageInfo> constructor = ArraysPackageInfo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ArraysPackageInfo instance = constructor.newInstance();

        if (instance == null) {
            throw new AssertionError("Expected reflective instance to be created");
        }

        System.out.println("ArraysPackageInfo test passed.");
    }
}
