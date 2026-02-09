package com.algos.graphs;

import java.lang.reflect.Constructor;

public final class GraphsPackageInfoTest {
    private GraphsPackageInfoTest() {
    }

    public static void main(String[] args) throws Exception {
        Constructor<GraphsPackageInfo> constructor = GraphsPackageInfo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        GraphsPackageInfo instance = constructor.newInstance();

        if (instance == null) {
            throw new AssertionError("Expected reflective instance to be created");
        }

        System.out.println("GraphsPackageInfo test passed.");
    }
}
