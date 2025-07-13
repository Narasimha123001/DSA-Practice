package SlidingWindow;
//Sliding Windoe or two pointers
public class optimizedHighSubArray {
    public static void main(String[] args) {
        int[] arr =  {5,2,8,1,9,7};
        int n = arr.length;
        int left = 0;
        int temp =0 ;
        int sum =0;
        int sl = 3;
        
        for(int right=0 ; right<n;right++){
            temp +=arr[right];
            if(right-left==sl){
              temp -=arr[left];
              left++;
            }
            
            if(right-left+1 == sl){
                sum = Math.max(sum, temp);
            }
        }
        System.out.println(sum);
    }
}