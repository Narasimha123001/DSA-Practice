public class Anagram{
    public static void main(String[] args){
        String st1 = "Listen";
        String st2 = "Silent";     
        
        int sum1 = 0;
        int sum2 = 0;



   
                       //small method;

                       for(int i= 0 ; i< st1.length();i++){
                        sum1 += st1.charAt(i);
                        
                       }
                       System.out.println(sum1);
                       for(int j=0 ; j< st2.length();j++){
                          sum2 += st2.charAt(j);
                           
                       }
                       System.out.println(sum2);
                     

                       if(sum1==sum2){
                        System.out.println("yes");
                       }else{
                        System.out.println("no");
                       }
    }
}


 // }

    //     public static void isAnagram(String st1 , String st2){
    //         if(st1.length() != st2.length()){
    //             System.out.println("Not a Anagram");
    //         }
    //         else{
    //             int count =0;
    //             for(int i = 0; i< st1.length(); i++){

    //                 char ch1 =st1.charAt(i); 
    //                 for(int j=0; j< st2.length(); j++){

    //                     char ch2 = st2.charAt(j);
    //                     if(ch1 == ch2){
    //                         count++;
    //                     }
    //                 }
    //             }

    //             System.out.println((count==st1.length())? "Is a Anagram" : "Not an Anagram");
    //         }
    //     }

