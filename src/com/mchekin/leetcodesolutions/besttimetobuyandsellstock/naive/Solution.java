package com.mchekin.leetcodesolutions.besttimetobuyandsellstock.naive;

/**
 * Problem: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best Time to Buy and Sell Stock</a>
 *
 * <p>
 * Time Complexity: O(n^2) (where n is the number of digits)
 * Space Complexity: O(1)
 */
public class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];

                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
