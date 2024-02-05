/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
// HashMap of Frequency String and List of String - TC: O(NK) where K is the length of the maximum string and N is the number of strings
// HashMap of Sorted String and List of String - TC: O(NLOGK) where K is the length of the maximum string and N is the number of strings
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Check for empty inputs
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringMap = new HashMap<>();
        for (String word : strs) {
            String frequencyString = getFrequencyString(word);
            Map<String, List<String>> frequencyStringMap = new HashMap<>();
        }

        private String getFrequencyString(String word) {
            int[] frequency = new int[26];
            for (int i = 0; i < word.length(); i++) {
                frequency[word.charAt(i) - 'a']++;
            }


        }

        // 2nd approach with HashMap of SortedString and List of String
        // if (strs == null || strs.length == 0) {
        //     return new ArrayList<>();
        // }
        // Map<String, List<String>> groupedAnagrams = new HashMap<>();
        // for (String word : strs) {
        //     char[] charArr = word.toCharArray();
        //     Arrays.sort(charArr);
        //     String sortedString = new String(charArr);
        //     if (groupedAnagrams.containsKey(sortedString)) {
        //         groupedAnagrams.get(sortedString).add(word); 
        //     } else {
        //         List<String> strList = new ArrayList<>();
        //         strList.add(word);
        //         groupedAnagrams.put(sortedString, strList);
        //     }
        // }
        // return new ArrayList<>(groupedAnagrams.values());
    }
}
// @lc code=end

