// Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
// Example 2:

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".
 

package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {
    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(findList(s, p));
        
    }

    public static List<Integer> findList(String a , String b){
        int left =0;
        HashMap<Character , Integer> hmb =  new HashMap<>();
        HashMap<Character , Integer> hma =  new HashMap<>();
        List<Integer> list  = new ArrayList<>();
        for(int i =0 ; i< b.length(); i++){
            char chb = b.charAt(i);
            hmb.put(chb , hmb.getOrDefault(chb , 0)+1);
        }
        for(int right =0 ; right< a.length(); right++){
            char cha  =  a.charAt(right);
            hma.put(cha, hma.getOrDefault(cha , 0)+1);
            if(right- left+1 > b.length()){
                char chleft = a.charAt(left);
                hma.put(chleft , hma.get(chleft)-1);
                if(hma.get(chleft) ==0){
                    hma.remove(chleft);
                }
                left++;
            }

            if(right - left +1 ==b.length()){
                boolean result = checking(hma, hmb);
                if(result){
                    list.add(left);
                }
            }
        }
        return list;
    }

    public static boolean checking(HashMap<Character , Integer> hms , HashMap<Character , Integer> hmp){

        if(hms.size() != hmp.size()){
            return false;
        }
        for(char key : hms.keySet()){
            if(!hmp.containsKey(key)){
                return false;
            }

            int a = hms.get(key);
            int b = hmp.get(key);
            if(a!=b){
                return false;
            }
        }

        return true;
    }
}