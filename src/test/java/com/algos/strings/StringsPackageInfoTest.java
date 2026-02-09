package com.algos.strings;

import java.lang.reflect.Constructor;

public final class StringsPackageInfoTest {
    private StringsPackageInfoTest() {
    }

    public static void main(String[] args) throws Exception {
        Constructor<StringsPackageInfo> constructor = StringsPackageInfo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StringsPackageInfo instance = constructor.newInstance();

        if (instance == null) {
            throw new AssertionError("Expected reflective instance to be created");
        }

        System.out.println("StringsPackageInfo test passed.");
    }
}
