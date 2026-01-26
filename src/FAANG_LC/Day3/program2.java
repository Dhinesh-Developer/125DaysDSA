package FAANG_LC.Day3;

// LC: 53
public class program2 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = Integer.MIN_VALUE;
            int cnt = 0;
            for(int i=0;i<nums.length;i++){
                cnt += nums[i];
                if(cnt > sum){
                    sum = cnt;
                }

                if(cnt < 0){
                    cnt = 0;
                }
            }
            return sum;
        }
    }
}
