package com.talan.dojo.cuttingrod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.*;

public class SolutionTest {

    @Test
    @DisplayName("test case 1")
    void testCase1() {
        int[] prices = {1, 1, 1, 1, 1, 1, 1, 1};
        int bestProfit = Solution.cuttingRod(prices, 4);
        Assertions.assertEquals(4, bestProfit);
    }

    @Test
    @DisplayName("test case 2")
    void testCase2() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int bestProfit = Solution.cuttingRod(prices, 1);
        Assertions.assertEquals(1, bestProfit);
    }

    @Test
    @DisplayName("test case 3")
    void testCase3() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int bestProfit = Solution.cuttingRod(prices, 4);
        Assertions.assertEquals(10, bestProfit);
    }

    @Test
    @DisplayName("test case 4")
    void testCase4() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int bestProfit = Solution.cuttingRod(prices, 5);
        Assertions.assertEquals(13, bestProfit);
    }

    @Test
    @DisplayName("test case 5")
    void testCase5() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int bestProfit = Solution.cuttingRod(prices, 8);
        Assertions.assertEquals(22, bestProfit);
    }

    @Test
    @DisplayName("test case 6")
    void testCase6() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70};
        int bestProfit = Solution.cuttingRod(prices, 10);
        Assertions.assertEquals(40, bestProfit);
    }

    @Test
    @DisplayName("test case 7")
    void testCase7() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70};
        int bestProfit = Solution.cuttingRod(prices, 12);
        Assertions.assertEquals(60, bestProfit);
    }

    @Test
    @DisplayName("test case 8")
    void testCase8() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 21};
        int bestProfit = Solution.cuttingRod(prices, 9);
        Assertions.assertEquals(25, bestProfit);
    }

    @Test
    @DisplayName("test case 9")
    void testCase9() {
        int[] prices = IntStream.range(1, 20).toArray();
        int bestProfit = Solution.cuttingRod(prices, 19);
        Assertions.assertEquals(19, bestProfit);
    }

    @Test
    @DisplayName("test case 10")
    //@Disabled("take too long to complete")
    void testCase10() {
        int[] prices = IntStream.range(1, 101)
                .mapToDouble((i) -> (i % 2 == 0) ? Math.floor(i / 2) : Math.floor((i / 3)))
                .mapToInt(i -> (int) i)
                .toArray();

        int bestProfit = Solution.cuttingRod2(prices, 99);
        Assertions.assertEquals(49, bestProfit);
    }
}
