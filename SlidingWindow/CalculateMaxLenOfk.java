package SlidingWindow;

public class CalculateMaxLenOfk {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 4, 1, 5, 6, 1, 7};

        System.out.println(OptimizeMaxLen(arr));
    }

    public static int maxLen(int[] arr) {

        int maxLen = 0;
        int len = arr.length;
        for(int i=0 ; i< len ; i++){
            int count =0;
            for(int j=i ; j< len ;j++){
                if(arr[j] == 1){
                    count++;
                }

                if(count ==2){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }

    //optimize  Time Com = O(n2);
    public static int OptimizeMaxLen(int[] arr){
        int left =0, maxLen =0, count =0 ,n=arr.length;
        for(int right = 0; right <n; right++){
            if(arr[right] == 1) count++;
            while(count >2){
                if(arr[left] == 1){
                    count --;
                }left++;
            }

            if(count == 2){
                maxLen = Math.max(maxLen , right-left+1);
            }
        }
        return maxLen;
    }
}
