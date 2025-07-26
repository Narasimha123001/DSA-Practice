package SlidingWindow;

import java.util.HashMap;

public class NewOne {
    public static boolean fum(HashMap<Character , Integer> hma , HashMap <Character,Integer> hmb){
       if(hma.size() != hmb.size()){
           return false;
       }
       for(char key : hma.keySet()){
           if(!hmb.containsKey(key)){
               return false;
           }
           int a = hma.get(key);
           int b = hmb.get(key);
           if(a != b){
               return false;
           }
       }
       return true;
    }
    
	public static void main(String[] args) {


    String sa = "hii";
    String sb = "iih";

    
    HashMap<Character, Integer> hma = new HashMap<>();
    HashMap<Character, Integer> hmb = new HashMap<>();


	   for(int i =0 ; i< sa.length(); i++){
	       char ch = sa.charAt(i);
	       hma.put(ch, hma.getOrDefault(ch , 0)+1);
	   }
	   for(int i =0 ; i< sb.length(); i++){
	       char ch = sb.charAt(i);
	       hmb.put(ch, hmb.getOrDefault(ch , 0)+1);
	   }
	   System.out.println(fum(hma , hmb));
	}
}
