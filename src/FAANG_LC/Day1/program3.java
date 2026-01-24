package FAANG_LC.Day1;
import java.util.*;

// LC: 287
public class program3 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int n = nums.length;
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                if(set.contains(nums[i])){
                    return nums[i];
                }else{
                    set.add(nums[i]);
                }
            }
            return -1;
        }
    }
}
