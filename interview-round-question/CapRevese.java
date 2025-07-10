public class CapRevese {
    public static void main(String[] args){
        String name = "vIjAy";

        for (int i=0 ; i< name.length();i++){

            char ch = name.charAt(i);
           

          //  System.out.println(ch);


            if(ch >= 'A' && ch <='Z'){

            //  System.out.println(ch);
                System.out.print((char)(ch + 32));
            }
            else if(ch >='a' && ch <='z'){
                System.out.print((char)(ch - 32));
            }
        }
    }
}
