package Arrays;
public class Array1 {
    public static void main(String[] args) {
        int arry1[] = {1,2,3,4,7,8,5,9,6,10,44,57,88,78};

        int count=0;
        for (int i = 0; i<arry1.length; i++){
            if(arry1[i]%2!=0){
                count=count+1;
                System.out.println(arry1[i]);
            }   
        }
        System.out.println("count: "+count);
    }

      
  
}
