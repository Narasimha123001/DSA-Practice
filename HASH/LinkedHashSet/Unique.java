package HASH.LinkedHashSet;
import java.util.*;
public class Unique {
    /*
     * Input: nums = [1, 2, 2, 1, 3]
     * Output: [[1, 2], [2, 2], [3, 1]]
     */


    public static void main(String[] args) {
        int[] arrs = {10,12,13,15,10,61,48,12,16,15,};

        List<List<Integer>> result = countFreq(arrs);

        for(List<Integer> num : result){
            System.out.println(num);
        }
       
    }

    private static List<List<Integer>> countFreq(int[] arrs) {
    
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> Unique = new LinkedHashSet<>();

        for(int arr : arrs){
            map.put(arr, map.getOrDefault(arr, 0)+1);
            Unique.add(arr);
        }
        
        List<List<Integer>> OrderList = new ArrayList<>();
        for(int num : Unique){
            OrderList.add(Arrays.asList(num , map.get(num)));
        }

        return OrderList;
    }
}