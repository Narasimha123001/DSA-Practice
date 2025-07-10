
package String;
public class ReverseAString{
    public static void main(String[] args) {

        String s="Narasimha";

        for(int i= 0; i<s.length(); i++){
            System.out.print(s.charAt(i));
         
        }
        System.out.println(" ");
        System.out.println("Reversed String :");

        String Ans="";

        for(int i=s.length()-1; i>=0; i--){
            Ans = Ans+s.charAt(i);
        }
        System.out.println(Ans);

    }
}