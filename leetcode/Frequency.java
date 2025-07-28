package leetcode;

import java.util.HashMap;

class Solution {
    public static int mostFrequentElement(int[] nums) {
        int k = nums.length;
        int max =0;
        int maxElement = 0;

        for(int i = 0 ; i< k; i++){
            int count = 1;
            for(int j=i+1 ;j<k ;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > max ){
                max = count;
                maxElement = nums[i];
            }
        }        
        return maxElement;
    }

   


    public static void main(String[] args){
        int[] arr = {4,4,5,5,6};
        HashMap<Integer , Integer> map =new HashMap<>();

        int maxFreq = 0;

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            maxFreq = Math.max(maxFreq , map.get(num));
            
        }
        System.out.println(maxFreq);
        

    }
}


