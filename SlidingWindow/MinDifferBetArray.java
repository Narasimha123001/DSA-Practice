package SlidingWindow;
// Example 1:

import java.util.*;

// Input: nums = [90], k = 1
// Output: 0
// Explanation: There is one way to pick score(s) of one student:
// - [90]. The difference between the highest and lowest score is 90 - 90 = 0.
// The minimum possible difference is 0.
// Example 2:

// Input: nums = [9,4,1,7], k = 2
// Output: 2
// Explanation: There are six ways to pick score(s) of two students:
// - [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
// - [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
// - [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
// - [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
// - [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
// - [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
// The minimum possible difference is 2.
public class MinDifferBetArray{



    public static int MinDiff(int[] arry, int k){

        int len = arry.length;
        System.out.println(len);
        Arrays.sort(arry);
        int min = Integer.MAX_VALUE;
        for(int right = 0; right<=len -k; right++){
            int currentIndex = arry[right];
            int nextToCurrent = arry[right+1];
            int diff = nextToCurrent - currentIndex;

            min = Math.min(min, diff);
        }

        return min;
    }
    public static void main(String[] args) {
        int arr[] = {4,9,7,1,0};
        int result = MinDiff(arr, 2);
        System.out.println(result);
    }
}