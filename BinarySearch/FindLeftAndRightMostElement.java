package BinarySearch;
// Example 1:
//leetcode -34
import java.util.Arrays;

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
public class FindLeftAndRightMostElement {
    public static int[] searchRange(int[] nums, int target) {
        int[] array = new int[2]; 
        array[0]= leftMostElement(nums, target);
        array[1] = RightMostElement(nums,target);
        return array;
    }
    public static int RightMostElement(int[] nums , int target){
        int left =0;
        int right =nums.length -1;
        while(left<=right){
            int mid = left +(right -left)/2;
            if(nums[mid] > target){
                right = mid -1;
            } else{
                left = mid+1;
            }
        }
        if(right<0 || nums[right] != target){
            return -1;
        }
        return right;
    }

    public static int leftMostElement(int[] nums , int target){
        int right = nums.length -1;
        int left = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target ){
                right = mid -1; 
            }else{
                left = mid+1;
            }
        }
        if(left >= nums.length || nums[left] != target){
            return -1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums , target)) );
    }
}
