package BinarySearch;



//when the same element repeated more then one time , then we return leftmostelement or rightmostelement. here the code was rightmostelement 


/*
 * arr  = {1,3,3,"3",5} -> here we return the right most index of 3 
 */

public class RightMostElement {
    public static int rightmostelement(int[] arr , int target){
        int right = arr.length-1;
        int left = 0;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(right<0 || arr[right]!=target){
            return -1;
        }
        System.out.println(arr[right] +" "+ right);
        return right;
    }


    //  public static int rightmostelement(int[] arr , int target){
    //     int right = arr.length-1;
    //     int left = 0;
    //     while(left<=right){
    //         int mid = left +(right-left)/2;
    //         if(arr[mid] == target){
    //             left =mid+1;   //-> move the left pointer to  the right sides
    //         }else if(arr[mid] > target){
    //             right = mid-1;
    //         }else{
    //             left = mid+1;
    //         }
    //     }
    //     System.out.println(arr[right] +" "+ right);
    // }
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,5};
        int target = 0;
        System.out.println(rightmostelement(arr, target));      
    }
}
