package leetcode; 

public class ValidPalindrome{

    public static boolean isPalindrome(String s){

        StringBuilder str1 = new StringBuilder();
        for(int i=0 ; i< s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str1.append(Character.toLowerCase(c));
            } 
        }

        String str = str1.toString();
        int n = str.length();

        boolean palindrome = true;
        for(int i=0; i< n/2; i++){
            if(str1.charAt(i) != str1.charAt(n-i-1)){
                palindrome = false;
            }
        }        
        return palindrome;
    } 

    public static void main(String[] arf){
        boolean res = isPalindrome("A man eeetis in ama");
        System.out.println(res);
    } 
}