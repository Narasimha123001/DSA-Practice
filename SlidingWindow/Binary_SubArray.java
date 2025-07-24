package SlidingWindow;
//leetcode 930 
/*
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15
 */
public class Binary_SubArray {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        if(goal<0){
            return 0;
        }
        int left =0 ; int count=0; int len = nums.length;
        int lenCount=0;
        for(int right=0  ; right< len; right++){
            if(nums[right] ==1){
                count++;
            }
            while (count > goal) {
                if(nums[left]==1){
                    count--;
                }left++;
            }
            lenCount +=(right-left+1);
        }
        return lenCount;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0} ; int goal =0;
        System.out.println(numSubarraysWithSum(nums, goal) - numSubarraysWithSum(nums, goal-1));
    }
}
