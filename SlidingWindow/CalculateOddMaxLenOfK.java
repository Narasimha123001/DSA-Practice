package SlidingWindow;

public class CalculateOddMaxLenOfK {
    public static void main(String[] args) {
        int[] arr = {12,1,3,1,1,6,7,1,8,1};
        System.out.println(KOddNumber(arr));
        
    }

    public static int KOddNumber(int[] arr){

        int left =0, maxLen =0 , count =0 ,k=2;
        for(int right =0; right<arr.length; right++){
            if(arr[right] %2!=0){
                count++;
            }

            while(count>k){
                if(arr[left] % 2!=0){
                    count--;
                }left++;
            }

            // if(count==k){
                
            maxLen = Math.max(maxLen, right -left +1);

            // }
        }
        return maxLen;
    }
}
