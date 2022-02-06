package com.mchekin.leetcodesolutions.besttimetobuyandsellstock.slidingwindow;

/**
 * Problem: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best Time to Buy and Sell Stock</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of daily prices)
 * Space Complexity: O(1)
 */
public class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null) {
            return 0;
        }

        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length) {
            int currentProfit = prices[right] - prices[left];

            // since left should point to the lowest left value,
            // if right points to a lower value, we left to point to the right value
            if (currentProfit < 0) {
                left = right;
            }

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            right++;
        }

        return maxProfit;
    }
}
