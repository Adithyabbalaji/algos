package com.algos.dp._1dp;

public class HouseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length, a = 0, b = 0;
        if (n == 1) return nums[0];
        int[] n1 = new int[n - 1];
        int[] n2 = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i != 0) n1[a++] = nums[i];
            if (i != n - 1) n2[b++] = nums[i];
        }
        return Math.max(r(n1), r(n2));


    }

    private int r(int[] num) {
        int n = num.length;
        if (n == 0) return 0;
        int prev2 = 0;
        int prev = 0;

        for (int nu : num) {
            int tmp = prev;
            prev = Math.max(prev, prev2 + nu);
            prev2 = tmp;
        }
        return prev;

    }

}
