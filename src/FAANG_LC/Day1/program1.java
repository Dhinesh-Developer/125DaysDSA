package FAANG_LC.Day1;

import java.util.Arrays;

// LC: 217
public class program1 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {

            // Optimal solution
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i-1] == nums[i]){
                    return true;
                }
            }
            return false;
        }
    }
}
