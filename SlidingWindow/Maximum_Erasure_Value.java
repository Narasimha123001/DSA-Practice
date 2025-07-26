package SlidingWindow;
//letcode --1695

import java.util.HashMap;

// Input: nums = [4,2,4,5,6]
// Output: 17
// Explanation: The optimal subarray here is [2,4,5,6].
// Example 2:

// Input: nums = [5,2,1,2,5,2,1,2,5]
// Output: 8
// Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
public class Maximum_Erasure_Value {
    public static void main(String[] args) {
        int[] arr = {5,2,1,2,5,2,1,2,5};
        int n = arr.length;
        int left=0; 
        int sum=0;int temp=0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int right =0 ; right<n; right++){
            
            int Rele = arr[right];
            sum+=Rele;
            hm.put(Rele , hm.getOrDefault(Rele , 0)+ 1);
            while(hm.get(Rele) >1){
                sum-=arr[left];
                int Lele = arr[left];
                hm.put(Lele , hm.get(Lele)-1);
                if(hm.get(Lele) == 0){
                    hm.remove(Lele);
                }
                left++;
            }
            temp = Math.max(temp ,sum);
        }
        System.out.println(temp);
    }
}
