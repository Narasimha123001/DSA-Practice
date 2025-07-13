import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n; i++){
                a[i] = sc.nextInt();
            }
        boolean result = isPalin(n, a);
        System.out.println(result);
    }
    public static boolean isPalin(int n , int[] a){
        boolean isPalin = true;
        for(int i=0; i<n/2 ;i++){
            if(a[i] != a[n -1-i]){
                isPalin = false;
                break;
            }
        }
    return isPalin;
    }
}