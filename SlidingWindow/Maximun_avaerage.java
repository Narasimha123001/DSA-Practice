package SlidingWindow;
/*
 * input = nums ={1,12,-5,-6,50,3} k=4
 * output = 12.75000
 * maximum average(12,-5,-6,50) /4 => 51/4 = 12.75000
 */
public class Maximun_avaerage {
    public static double MaxAverage(int[] arr){
        int total=0 , count=0 , left=0; double maxWeight=0;
        for(int right =0; right < arr.length; right++){
            total+=arr[right];
            count++;

            if(count>4){
                total-=arr[left];
                count--;
                left++;
            }

            maxWeight = Math.max(maxWeight, total/4.0);
            
        }
        return maxWeight;
    }

    public static void main(String[] args) {
         int[] arr  = {1,12,-5,-6,50,3};
         System.out.println(MaxAverage(arr));
        
    }
   
    
    

    
}
