package String;

public class Palindrome2 {
    public static void main(String[] args) {
        boolean ispanlidrome = true;

        String str1 = "dbcdfedcba";
        
        int n = str1.length();

        for(int i= 0; i<n/2; i++){
            System.out.println(i);
            if(str1.charAt(i)!= str1.charAt(n-1-i)){
                ispanlidrome = false;
                break;
            }
        }if(ispanlidrome){
            System.out.println("its is palindrome");
        }else{
            System.out.println("not a Panlindrome");
        }
    }
}
