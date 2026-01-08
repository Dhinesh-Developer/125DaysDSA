package BuildingFoundation30.Day2;
import java.util.*;

/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
* */

public class program2 {
    class Solution {
        public boolean isAnagram(String s, String t) {

            // Brute force
            char[] s1 = s.toCharArray();
            char[] s2 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            return Arrays.equals(s1,s2);
        }
    }
}
