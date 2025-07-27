package SlidingWindow;
//what is max members to fitting in the window
public class VariableSliding {
    
    public static void main(String[] args) {
        int[] arr = {1,7,5,2,9};
        int window_size = 10;
        int left =0;
        int total =0;
        int max = 0;
        int count =0;
        for(int right = 0 ; right<arr.length; right++){
            total += arr[right];

            while(total > window_size){
                total -= arr[left];
                left++;
            }

            max = Math.max(max , right-left +1);
            count++;
            
        }
        System.out.println(max);
        System.out.println(count);
    }
}
