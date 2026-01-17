package BuildingFoundation30.Day11;
import java.util.*;
/*
78. Subsets

Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]


Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
* */
public class program1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        func(nums,0,res,subset);
        return res;
    }

    private void func(int[] nums,int ind,List<List<Integer>> res,List<Integer> subset){
        int n = nums.length;
        if(ind == n){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[ind]);
        func(nums,ind+1,res,subset);

        subset.remove(subset.size()-1);
        func(nums,ind+1,res,subset);
    }
}
