package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Maxandmin {
    public static void main(String[] args) {

        int[] arrs = {1,2,2,3,3,3, 3,1,1};

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int arr: arrs){
            map.put(arr , map.getOrDefault(arr, 0)+1);
            
        }

        int maxFreq = Integer.MIN_VALUE , minFreq = Integer.MAX_VALUE;
        int maxele = -1, minele = -1;


        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            int element = entry.getKey();
            int freq = entry.getValue();


            if(freq > maxFreq){
                maxFreq = freq;
                maxele = element;
            }

            if(freq < minFreq ){
                minFreq = freq;
                minele = element;
            }
        }

       

                System.out.println("min: " + minele + " freq: " + minFreq + "    max: " + maxele + " freq: " + maxFreq);

    }
}
    //     int[] arr = {1,2,2,3,3,3, 3,1,1};
    //     int n =arr.length;
    //     int max = 0 , maxele =0;
    //     int min =n, minele=0;

    //     boolean[] visted = new boolean[n];

    //     for(int i=0 ; i< n ; i++){
    //         if(visted[i] == true){
    //             continue;
    //         }

    //         int count =1;
    //         for(int j =i+1; j< n ; j++){
    //             if(arr[i] == arr[j]){
    //                 visted[i] = true;
    //                 count++;
    //             }
    //         }
    //         if(count > max){
    //             max = count;
    //             maxele = arr[i];
    //         }
    //         if(count < min){
    //             min = count;
    //             minele= arr[i];
    //         }
    //     }

    //     System.out.println("min:"+minele+"freq: "+min+"    " + "max:"+maxele+"freq"+max);
    // }
    

