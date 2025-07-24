
package SlidingWindow;

import java.util.*;

// Example 1:

// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.
// Example 2:

// Input: fruits = [0,1,2,2]
// Output: 3
// Explanation: We can pick from trees [1,2,2].
// If we had started at the first tree, we would only pick from trees [0,1].
// Example 3:

// Input: fruits = [1,2,3,2,2]
// Output: 4
// Explanation: We can pick from trees [2,3,2,2].
// If we had started at the first tree, we would only pick from trees [1,2].
public class FruitsBasket904 {
    
    public static void main(String[] args) {
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};

        System.out.println(frequeny(arr));
    }

    public static int frequeny(int[] arr){

    
        int n = arr.length;
        int reult=0;
        int left= 0;
        HashMap<Integer ,Integer> hm = new HashMap<>();
        for(int right=0;right<n; right++){
            int rightVal =  arr[right];

            hm.put(rightVal , hm.getOrDefault(rightVal, 0)+1);


            while(hm.size() >2){
                int leftVal = arr[left];
                hm.put(leftVal , hm.get(leftVal)-1);
                if(hm.get(leftVal) ==0){
                    hm.remove(leftVal);
                }
                left++;
            }

            reult = Math.max(reult , right - left +1);
        }

        return reult;
    }
}
