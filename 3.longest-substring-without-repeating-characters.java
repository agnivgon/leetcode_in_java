/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
// TC: O(N) SC: O(1)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        if (s.length() < 1) {
            return output;
        }
        int left = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!charIndexMap.containsKey(ch)) {
                charIndexMap.put(ch, right);
            } else {
                left = Math.max(left, charIndexMap.get(ch) + 1);
                charIndexMap.put(ch, right);
            }
            output = Math.max(output, right - left + 1);
        }
        return output;
    }
}
// @lc code=end

