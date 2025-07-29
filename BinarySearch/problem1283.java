package BinarySearch;

import java.util.Arrays;

/*
 * Given an array of integers nums and an integer threshold, we will choose a positive 
 * integer divisor, divide all the array by it, and sum the division's result. 
 * Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element.
 (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.
Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
 */
public class problem1283 {
    public static void main(String[] args) {
        int[] nums ={21212,10101,12121};// {44,22,33,11,1};
        int threshold =1000000;
        System.out.println(leftmost(nums, threshold));

    }
    public static int leftmost(int[] nums , int threshold){
        int right = 1000000;
        int left = 1;
        while(left<=right){
            int mid = left + (right -left)/2;
            if(isPossible(nums, mid, threshold)){
                right = mid -1;
            }else{
                left =mid +1;
            }
        }
        return left;
    }

    public static boolean isPossible(int[] nums , int k , int threshold){
        int n =nums.length;
        for(int i=0 ; i<n; i++){
            int d = nums[i]/k;
            if(nums[i]%k != 0){
                d++;
            }
           // System.out.println("d: "+d);
            //sum += d; -> overflow 
            threshold -=d;
            if(threshold < 0){
                return false;
            }
        }
        return true;
    }
}
