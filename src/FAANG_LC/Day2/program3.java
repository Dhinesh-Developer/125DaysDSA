package FAANG_LC.Day2;

// LC : 724
public class program3 {
    class Solution {
        public int pivotIndex(int[] nums) {
            int n = nums.length;
            int total = 0;
            for(int x : nums) total += x;

            int leftSum = 0;
            for(int i=0;i<n;i++){
                total -= nums[i];
                if(leftSum == total) return i;
                leftSum += nums[i];
            }
            return -1;
        }
    }
}
