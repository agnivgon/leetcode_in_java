/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
// TC: O(N) SC: O(1)
// answer = prefix product * suffix product
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        int n = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
        // TC: O(N)  SC: O(N)
        // int[] pre = new int[n];
        // int[] suf =  new int[n];
        // pre[0] = 1;
        // suf[n - 1] = 1;
        // for (int i = 1; i < n; i++) {
        //     pre[i] = pre[i - 1] * nums[i - 1];
        // }
        // for (int i = n - 2; i >= 0; i--) {
        //     suf[i] = suf[i + 1] * nums[i + 1];
        // }
        // int ans[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     ans[i] = pre[i] * suf[i];
        // }
        // return ans;
    }
}
// @lc code=end

