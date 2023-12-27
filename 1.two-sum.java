/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> keyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (keyMap.containsKey(diff)) {
                ans[0] = keyMap.get(diff);
                ans[1] = i;
                break;
            } else {
                keyMap.put(nums[i], i);
            }
        }
        return ans;
    }
}
// @lc code=end

