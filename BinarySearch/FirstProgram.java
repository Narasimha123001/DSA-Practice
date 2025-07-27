package BinarySearch;
public class FirstProgram {
    public static int binary_Search(int[]  arr , int target){

        int left =0;
        int right = arr.length-1;
        while(right >= left){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] >target){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,12,14,16,20,25,27,30}; 
        int target = 5 , target1 =27 , target2=4;
        System.out.println(binary_Search(arr, target));
        System.out.println(binary_Search(arr, target1));
        System.out.println(binary_Search(arr, target2));
       
       
       
        //without method
       
       
        int ans =-1;
        int left =0;
        int right = arr.length-1;
        while(right >= left){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid] >target){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        System.out.println("target:"+target+" position:"+ ans);
    }
}
