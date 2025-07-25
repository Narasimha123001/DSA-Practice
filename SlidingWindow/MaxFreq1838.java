package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

// The frequency of an element is the number of times it occurs in an array.

// You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

// Return the maximum possible frequency of an element after performing at most k operations.

 

// Example 1:

// public int maxFrequency(int[] nums, int k) {
// Input: nums = [1,2,4], k = 5
// Output: 3
// Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
// 4 has a frequency of 3.
/*
 * 1,2,4 
 * 1
 * windosize = 1
 * total =1
 * 1* windosize = 1*1
 * 1*1-total=0<=k   fre= 1
 * 
 * 1,2
 * windowsize = 2
 * total =3
 *  last didit * size = 2*2 - total3 = 4-3 =1 <=5
 * 1,2,4
 * window size = 3
 * total = 7 
 * lastdigit = 4 * size = 12 - total 7 = 12- 7 = 5 <=5
 * 
 * highest size = 3 
 * 
 */
public class MaxFreq1838 {
    



   
    //   public static void main(String[] args) {
    //     int[] arr = {3,9,6};
    //     Arrays.sort(arr);
    //     int maxSize =0;
    //     int k =2;
    //     while(arr.length >0){
    //         int total =0;
    //         for(int i =0 ; i<arr.length ; i++ ){
    //         total += arr[i];
    //         int windosizesize = i+1;
    //         int differ = (arr[i] * windosizesize) - total;
    //         if(differ <= k){
    //             maxSize = Math.max(maxSize, windosizesize);
    //         }
    //         else{
    //             arr= arr2(arr);
    //             break;
    //         }
    //     }
    //      break;
    //   }
    //     System.out.println(maxSize);
    // } 

    //   public static int[] arr2(int[] arr){
    //     if(arr.length<=1)return new int[0];
    //     int[] newArr = new int[arr.length - 1]; 
    //     for (int i = 1; i < arr.length; i++) {
    //         newArr[i - 1] = arr[i];
    //     }
    //     return newArr;
    // }






    public static int MaxFre(int[] arry, int k){
        
        
        Arrays.sort(arry);
        int len = arry.length;
        int left =0;
        long total = 0;
        int maxFre = 0;
        for(int right = 0 ; right <len; right++){
            total += arry[right];
            
            while((long)arry[right] * (right-left +1) - total > k){
                total -= arry[left];
                left++;
            }
            maxFre =  Math.max(maxFre, (right-left+1)); 
        }
        
        return maxFre;
    }


    public static void main(String[] ar){
        int[] arr = {5,6,2,6};
        int re = MaxFre(arr, 5);
        System.out.println(re);
    }





    
}
