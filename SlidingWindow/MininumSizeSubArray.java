package SlidingWindow;

/*
 * Given an array of positive integers nums and a positive integer target,
 *  return the minimal length of a subarray whose sum is greater than or equal to target. 
 * If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */

public class MininumSizeSubArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;int total =0;int  left= 0;
        for(int right=0 ; right<nums.length; right++){
            total +=nums[right];
            while(total >= target){
                 min = Math.min(min, right-left+1);
                total -=nums[left];
                left++;
            } 

            
        }
        return (min == Integer.MAX_VALUE ? 0: min);
    }

    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target , nums));
    }
}
