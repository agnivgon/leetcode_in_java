/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
// TC: O(N) SC: O(1)
// Start with 0th index as left pointer and 1st index as right pointer, 
// check if right pointer price is greater than left pointer price which is profit
// If so check the max with profit calculated earlier and current calculated profit and store it.
// Keep moving right pointer till end.
// If at any point right pointer price is less than or equal to left pointer price then move the left pointer to right pointer's index.
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;
        int left = 0;
        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }
}
// @lc code=end

