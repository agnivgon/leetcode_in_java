/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
// https://www.youtube.com/watch?v=4oZsPXG9B94
// With HashSet TC: O(N) SC: O(N)
// With Sort TC: O(NLOGN) SC: O(1)
// 1st approach - First Sort the list and then check both the consecutive numbers are same or not
// 2nd approach - Take HashSet, in that check if the number is present or not, if present then it's duplicate if not present then add it in HashSet
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            if (uniqueNumbers.contains(num)) {
                return true;
            }
            uniqueNumbers.add(num);
        }
        return false;
        // 2nd approach with sort
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;
    }
}
// @lc code=end

