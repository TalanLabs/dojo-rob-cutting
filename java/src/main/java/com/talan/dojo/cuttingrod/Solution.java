package com.talan.dojo.cuttingrod;

import java.util.Arrays;

public class Solution {

    // Function to find the best way to cut a rod of length n
    // where the rod of length `i` has a cost `price[i-1]`
    public static int cuttingRod(int[] prices, int n) {
        if (n == 0)
            return  0;

        int maxValue = 0;

        // one by one, partition the given rod of length `n` into two parts of length
        // (1, n-1), (2, n-2), (3, n-3), … ,(n-1, 1), (n, 0) and take maximum
        for (int i = 1; i < n + 1; i++) {

            // # rod of length `i` has a cost `price[i-1]`
            int cost = prices[i - 1] + cuttingRod(prices, n - i);
            if (cost > maxValue) {
                maxValue = cost;
            }
        }

        return maxValue;
    }

    // Function to find the best way to cut a rod of length n
    // where the rod of length `i` has a cost `price[i-1]`
    public static int cuttingRod2(int[] prices, int n) {

        // `table[i]` stores the maximum profit achieved from a rod of length `i`
        int table[] = new int[n + 1];
        Arrays.fill(table, 0);

        // consider a rod of length `i`
        for (int i = 1; i < n + 1; i++) {
           for (int j = 1; j < i + 1; j++) {

               // divide the rod of length `i` into two rods of length `j`
               //  and `i-j` each and take maximum
               table[i] = Math.max(table[i], prices[j - 1] + table[i - j]);
           }
        }

        //`table[n]` stores the maximum profit achieved from a rod of length `n`
        return table[n];
    }
}
