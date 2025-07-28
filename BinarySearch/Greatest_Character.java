package BinarySearch;
/*
 * fing the greatest char that is less
 * then the target charracter in that array;
 * if arr ={'c','e','g','k','y'};
 * target = 'd' return 'c';
 * target = 'f' return 'e';
 * target = 'z' retutn 'y'
 */
public class Greatest_Character {
   
    public static char binary(char[] arr , char target){
        int r = arr.length;
        int l = 0;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        if(r== -1){
            return 'a';
        }
        return arr[r];
    }

    public static void main(String[] args) {
        char[] arr = {'c','e','g','k','y'};
        char target = 'f';

        System.out.println(binary(arr, target));
    }
}
