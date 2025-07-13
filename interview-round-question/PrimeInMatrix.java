import java.util.Scanner;

public class PrimeInMatrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(checkPrime(arr[i][j])){
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }


    private static boolean checkPrime(int n) {
       if(n <= 1){
        return false;
       }
       for(int i=2 ; i<=n/2;i++){
        if(n%2==0){
            return false;
        }
       }
       return true;
    }

}