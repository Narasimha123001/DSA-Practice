package SlidingWindow;

import java.util.HashSet;

public class substring1876{


    //brute force tech
    // public static int CountgoodString(String str){
    //     int n = str.length();
    //     int count =0;
    //     for(int i=0; i<n ; i++){
    //         for(int j=i+1 ; j<n; j++){
    //             for(int k = j+1; k<n; k++){
    //                 if(k-i+1 == 3){
    //                     char a = str.charAt(i);
    //                     char b = str.charAt(j);
    //                     char c = str.charAt(k);

    //                     if(a != b && b != c && c!= a){
    //                         count++;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return count;
    // }


    public static int CountgoodString(String s){
        int len = s.length();
        int count = 0;
        for(int left=0 ; left<=len-3; left++){
            String temp = s.substring(left, left+3);
            count+=countuni(temp);
        }
        return count;
    }

    public static int countuni(String s){
        HashSet<Character> hs = new HashSet<>();
        int len = s.length();
        for(int i=0 ; i< len; i++){
            hs.add(s.charAt(i));
        }
        return hs.size() == 3 ? 1:0;
    }
    

    public static void main(String[] mn){
        int result = CountgoodString("aababcabc");
        System.out.println(result);
    }
    
}