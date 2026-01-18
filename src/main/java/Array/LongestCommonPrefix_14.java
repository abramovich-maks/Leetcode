package Array;
/*
* 14. Longest Common Prefix
Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
* */


class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] str2 = {"ab", "a"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(str2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].length() == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // если i больше чем длина строки или символ не совпал -> СТОП! обрезаем!
                if (i >= strs[j].length() || currentChar != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }

            }
        }
        return strs[0];
    }
}
