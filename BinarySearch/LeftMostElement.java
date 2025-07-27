package BinarySearch;

//when the same element repeated more then one time , then we return leftmostelement or rightmostelement. here the code was leftmostelement 
public class LeftMostElement {

//  int[] arr = {1,3,3,3,5};
    public static int leftMostBinaray(int[] arr , int target){
        int r = arr.length-1;
        int l = 0;
        while(l<=r){
            int mid =  l +(r-l)/2;
           if(arr[mid] >= target){
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        if( l>=arr.length || arr[l] !=target){
            return -1;
        }
        System.out.println(l+"  "+r);
        return arr[l];
    }

    // public static int leftMostBinaray(int[] arr , int target){
    //     int r = arr.length-1;
    //     int l = 0;
    //     while(l<=r){
    //         int mid =  l +(r-l)/2;
    //         if(arr[mid] == target){
    //             r = mid-1;
    //         }else if(arr[mid] > target){
    //             r = mid -1;
    //         }else{
    //             l = mid+1;
    //         }
    //     }
    //     System.out.println(l+"  "+r);
    //     return l;
    // }


    public static void main(String[] args) {
        int[] arr = {1,3,3,3,5};
        int target = 6;
        System.out.println(leftMostBinaray(arr, target));      
    }
}
