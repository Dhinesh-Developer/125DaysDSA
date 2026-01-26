package FAANG_LC.Day3;
import java.util.*;

// LC: 169
public class program1 {
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            int k = nums.length/2;
            for(Map.Entry<Integer,Integer> x : map.entrySet()){
                if(x.getValue() > k){
                    return x.getKey();
                }
            }

            return -1;
        }
    }
}
