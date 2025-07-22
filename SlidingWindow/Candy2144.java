package SlidingWindow;

import java.util.Arrays;

public class Candy2144 {
   public static int minimumCost(int[] cost) {
        Arrays.sort(cost);  // ascending {1,3,3,3}
        int n = cost.length; //n =4
        int ans = 0;
        int took =0;

   
        // if (n == 0) return 0;
        // if (n == 1) return cost[0];
        // if (n == 2) return cost[0] + cost[1];


        for(int i = n-1; i>=0; i--){
            if(took == 2){
                took =0;
            }else{
                ans+=cost[i];
                took++;
            }
        }
        return ans;
    }

    //     // Traverse from the end
    //     for (int i = n - 1; i >= 0; i--) {
    //         /*
    //          * i = 3 
    //          * 
    //          * n-1-i = 4-1-3 =0 %3 = 0 !=2 true
    //          * ans = 3
    //          * i=2
    //          * n-1-i = 4-1-2 = 1 %3 = 1 != true
    //          * ans = 3+3 = 6
    //          * 
    //          * i=1;
    //          * n-1-i = 4-1-1 = 2 %3 = 2!=2 false
    //          * 
    //          * i=0
    //          * n-1-i = 4-1-0 = 3 % 3 = 
    //          * 
    //          */
    //         // Skip every third candy
    //         if ((n - 1 - i) % 3 != 2) {
    //             ans += cost[i];
    //         }
    //     }
    //     return ans;
    // }




    public static void main(String[] args) {
        int[] arr = {5,5};
        int res = minimumCost(arr);
        System.out.println(res);
    }
}