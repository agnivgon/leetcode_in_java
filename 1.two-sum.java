/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
// TC: O(N) SC: O(N)
// Loop through the number list, check if the difference value is already present in the map. 
// If it's present take the current number index and get the index value of the diff number from the map.
// If not present then add the number with it's index value in the map.
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

