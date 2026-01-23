package BuildingFoundation30.Day16;
/*
Odd or Even
Difficulty: BasicAccuracy: 60.6%Submissions: 212K+Points: 1Average Time: 5m
Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

Examples:

Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.
Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number.
* */
public class program1 {
    class Solution {
        static boolean isEven(int n) {
            // code here
            int dup = n;
            if(n%2==1) return false;
            else return true;
        }
    }
}
