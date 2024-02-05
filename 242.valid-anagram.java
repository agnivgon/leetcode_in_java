/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
// https://www.youtube.com/watch?v=IRN1VcA8CGc&t=284s
// TC: O(N) SC: O(1)
// For 26 english alphabet chars, take a int array of 26, each index is for each alphabet
// Now increase the aplhabet index for each count of s string, and decrease for t sring
// At the end if the array contains 0 in all the index then it is an anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
        // 2nd approach with Sort
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();
        // Arrays.sort(sArr);
        // Arrays.sort(tArr);
        // return Arrays.equals(sArr, tArr);
    }
}
// @lc code=end

