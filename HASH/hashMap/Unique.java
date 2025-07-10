package HASH.hashMap;

import java.util.HashMap;
import java.util.LinkedHashSet;

import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        int[] arrs = {10,12,13,15,10,61,48,12,16,15,};
        int n = arrs.length;

        HashMap <Integer, Integer> map =new HashMap<>();

        for(int i = 0 ; i< n; i++){
            map.put(arrs[i],map.getOrDefault(arrs[i],0 )+1);
        }


        Set<Integer> uniqueSet =  new LinkedHashSet<>();

        for(int arr : arrs){
            uniqueSet.add(arr);
        }

        for(int num : uniqueSet){
            System.out.println(num + " "+ map.get(num));
        }
    }
}
