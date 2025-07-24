package SlidingWindow;

/*
 * Given an array of integers nums and an integer k. 
 * 

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 */
public class Count_OddNumber {

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k =2;
        System.out.println(ans(arr, k));
    }
    public static int ans(int[] arr , int k){
        return func(arr, k) - func(arr, k-1);
    }
    public static int func(int[] arr , int k){
         int count=0;
        int left=0;
        int lencount =0;
        for(int r=0 ; r<arr.length ; r++){
            if(arr[r] % 2 !=0){
                count++;
            }
            while(count > k){
                if(arr[left]%2 ==1){
                    count--;
                }
                left++;
            }
            
            lencount +=(r - left+1);
            
            
        }
        return lencount;
    }
    // public static int numberOfSubarrays(int[] nums, int k) {
    //     int len = nums.length;
    //     int left =0 ; 
    //     int count =0;
    //     int lencount =0; 
    //     for (int right=0  ; right <len; right++){
    //         if(nums[right] % 2 !=0){
    //             count++;
    //         }
    //         while(count > k){
    //             if(nums[left] %2 !=0){
    //                 count--;
    //             }
    //             left++;
    //         }  
    //         if(count == k){
    //             lencount++;
    //         }
    //     }
    //     return lencount;
        
    // }

    // public static void main(String[] args) {
    //     int[] nums = {2,2,2,1,2,2,1,2,2,2};int  k = 2;
    //     System.out.println(numberOfSubarrays(nums, k));
    // }
}
