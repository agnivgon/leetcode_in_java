/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
// https://www.youtube.com/watch?v=BoHO04xVeU0&t=510s
// TC: O(N) SC: O(N)
// Loop through the number list, check if the difference value is already present in the map. 
// If it's present take the current number index and get the index value of the diff number from the map.
// If not present then add the number with it's index value in the map.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] {numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found!");
    }
}
// @lc code=end

