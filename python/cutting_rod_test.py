
import unittest
# import pytest
import math

from cutting_rod import rod_cut, rod_cut2


class CuttingRodTest(unittest.TestCase):

    def test_case_1(self):
        prices = [1, 1, 1, 1, 1, 1, 1, 1]
        n = 4
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 4)

    def test_case_2(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20]
        n = 1
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 1)

    def test_case_3(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20]
        n = 4
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 10)

    def test_case_4(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20]
        n = 5
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 13)

    def test_case_5(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20]
        n = 8
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 22)

    def test_case_6(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70]
        n = 10
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 40)

    def test_case_7(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70]
        n = 12
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 60)

    def test_case_8(self):
        prices = [1, 5, 8, 9, 10, 17, 17, 20, 21]
        n = 9
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 25)

    def test_case_9(self):
        prices = [i for i in range(1, 20)]
        n = 19
        max_profit = rod_cut(prices, n)
        self.assertEqual(max_profit, 19)

    #  @pytest.mark.skip(reason="take to long to complete")
    def test_case_10(self):
        prices = [math.floor(i / 2) if i % 2 == 0 else math.floor(i / 3) for i in range(1, 100)]
        n = 99
        max_profit = rod_cut2(prices, n)
        self.assertEqual(max_profit, 49)

    # @pytest.mark.skip(reason="take to long to complete")
    def test_case_11(self):
        prices = [math.floor(i / 2) if i % 2 == 0 else math.floor(i / 3) for i in range(1, 1000)]
        n = 999
        max_profit = rod_cut2(prices, n)
        self.assertEqual(max_profit, 499)

