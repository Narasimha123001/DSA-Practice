import java.util.Scanner;

public class IdenticallMartix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];

       for(int i = 0; i < n; i++){
        for (int j = 0; j < n; j++) {
            a[i][j] = sc.nextInt();
            }
        }

        boolean result = Identical(n, a);
        System.out.println(result);
        sc.close();
    }


    public static boolean Identical(int n, int[][] a){
        
        for(int i = 0; i < n; i++){
         for(int j=0 ; j<n ;j++){
            if(a[i][j] ==1){
                if(a[i][j] != a[j] [i]){
                    return false;
                }
            }

         }
        //     if(a[i][i] != 1){
        //         return false;
        //     }if (a[i][n - 1 - i] != 1) {
        //     return false;
        // }
                }
            
        
    return true;
    }
}