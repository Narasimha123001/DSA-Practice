package SlidingWindow;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String s = "Narasi";
        int n = s.length();

        ArrayList<String> list = new ArrayList<>();
        for(int i=0 ; i <n; i++ ){
            for(int j=i; j <n; j++ ){
                String temp = s.substring(i, j+1);
                list.add(temp);
                // for(int k = i ; k<=j; k++){
                //     System.out.print(s.charAt(k));
                // }
            }
        }
        System.out.println(list);
    }
}
