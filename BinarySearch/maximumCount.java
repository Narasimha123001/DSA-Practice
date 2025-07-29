package BinarySearch;
import java.util.*;

//leetcode 2529

/*
 * Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
Example 3:

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 */
public class maximumCount {
    
    public static int leftMost(int[] arr , int target ){
        int left =0;
        int right = arr.length -1;
        int max =0;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid] >= target){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        //max = Math.min(left,left-arr.length);
        return left;
    }


    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};//{-2,-1,1,2,3};;
        int target = 1;
        int target1 =0;
        int result = Math.max(leftMost(nums, target1) , nums.length -leftMost(nums, target));
        System.out.println(leftMost(nums, target1));
        System.out.println(leftMost(nums, target));
        System.out.println(nums.length - leftMost(nums, target));
        System.out.println(result);
    }
}
