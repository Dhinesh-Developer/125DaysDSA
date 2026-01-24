package FAANG_LC.Day1;
import java.util.*;

//LC: 26
public class program2 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            Set<Integer> set = new TreeSet<>();
            for(int x : nums) set.add(x);

            int size = set.size();
            int ind = 0;
            for(int x : set){
                nums[ind++] = x;
            }

            return size;
        }
    }
}
