package HASH.hashset;

import java.util.HashSet;

public class Uniques {

    public static void main(String[] args) {
        int[] nums = {10,12,15,13,10,12,15,16,15};
        int n = nums.length;

        HashSet<Integer> seens = new HashSet<>();


        for(int i=0; i< n; i++){
            seens.add(nums[i]);
        }

        for(int seen : seens){
            System.out.println(seen);
        }
    }
    
}
