package SlidingWindow;
//to find the max subArray k zeros
//1,1,0,1,0,0,0  k=2  output = 5
//ans: 1,1,1,1,1,0,0 k=5
//  1,1,0,1,0,1,1 k=2
// any two zero we can flip and change(2 chances) to 1 and max length
public class MaxBinaryArray {
    

    public static int MaxBinarSeq(int[] arr,int k){
        int len = arr.length;
        int count =0;
        int left =0;
        int maxlen =0;


        for(int right=0; right< len ; right++){
            if(arr[right] == 0){
                count++;
            }
            while(count > k){
                if(arr[left] == 0){
                    count--;
                }
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    } 



    public static void main(String[] args) {
        int[] arr ={1,1,0,1,0,0,0};
        int k =2;
        System.out.println(MaxBinarSeq(arr, k));
    }
}
