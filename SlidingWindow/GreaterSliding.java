package SlidingWindow;

public class GreaterSliding {

    public static int MaxSub(int[] arry , int k,int threesold){
        int left =0 , total =0, n=arry.length , count=0;
        for(int right = 0; right <n; right++){
            total +=arry[right];
            if(right - left == k){
                total -=arry[left];
                left++;
            }
            if(right - left +1 ==k){
                if(total >= threesold){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arry = {1,2,3,1,4,4,2,3,5};
        int result = MaxSub(arry, 3, 7);
        System.out.println(result);
    }
    
}
