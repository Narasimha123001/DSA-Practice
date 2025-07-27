package SlidingWindow;

import java.util.HashMap;

//leetcode 992
/*
 * 
 * Input: nums = [1,2,1,2,3], k = 2
    Output: 7
    Explanation: no of Subarrays formed with exactly 2 different integers: 
    [1,2], [2,1], [1,2], [2,3], 
    [1,2,1], [2,1,2], [1,2,1,2]
 */
public class SubArrayWithKDiffer {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};int  k=2;
        System.out.println(SubArrayFreq(nums, k) -SubArrayFreq(nums, k-1));
    }
    public static int SubArrayFreq(int[] arr  , int size){
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = arr.length;
        int left =0, count=0;
        for(int r=0 ; r<n ;r++){
            int Rele = arr[r];
            
            hm.put(Rele , hm.getOrDefault(Rele , 0)+1);

            while(hm.size() >size){
                int Lele = arr[left];
                hm.put(Lele , hm.get(Lele)-1);
                if(hm.get(Lele)==0){
                    hm.remove(Lele);
                }left++;
            }
            count +=(r-left+1);
        }
        return count;
    }
}
