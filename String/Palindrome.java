package String;

public class Palindrome {

    public static void main(String[] args) {
        String s1= "adcsegercda";
        String s2= "";
        for(int i=s1.length()-1; i>=0;i--){
            s2 +=s1.charAt(i);
        }
        if(s2.equals(s1)){
            System.out.println("yes its a panlidrome" );
            System.out.println("s1:"+s1);
            System.out.println("s2:"+s2);
        }
        else{
            System.out.println("not a panlindrome");
        }
    }
    
}
