package com.algos.arrays.intervals;

import java.lang.reflect.Constructor;

public final class IntervalsPackageInfoTest {
    private IntervalsPackageInfoTest() {
    }

    public static void main(String[] args) throws Exception {
        Constructor<IntervalsPackageInfo> constructor = IntervalsPackageInfo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        IntervalsPackageInfo instance = constructor.newInstance();

        if (instance == null) {
            throw new AssertionError("Expected reflective instance to be created");
        }

        System.out.println("IntervalsPackageInfo test passed.");
    }
}
