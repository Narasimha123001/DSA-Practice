package SlidingWindow;

public class HighestSubArry {
    public static void main(String[] args) {
        

       
        int[] arr = {5,9,1,8,7,14,34,9};
        int k =3;
        int max  =0;
        int start =0;
        for(int i=0 ; i<= arr.length-k; i++){
            int sum =0;
            for(int j =0 ; j<k; j++){
                sum +=arr[i+j];
            }

            if(sum > max){
                max = sum ;
                start = i;
            }
            // max = Math.max(max,sum);
        }
        System.out.println(max);
        for(int i =start; i<start+k; i++ ){
            System.out.println(arr[i]);
        }
    }
}
