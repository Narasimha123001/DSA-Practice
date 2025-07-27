package BinarySearch;
/*
 * insert the new element in the array and return the index of the new element
 *  when l > r there the loop was break and return the left -> its was the position of the new element  
 * 
 */
public class InsertNewEle {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 10;
        System.out.println(binary(arr, target));
    }


    public static int binary(int[] arr , int target){
        int l=0 ;
        int r = arr.length-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(arr[mid]==target){ 
                return mid+1;
            }else if(arr[mid] > target){
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
