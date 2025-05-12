public class WhileLoop{
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        while(n > 0){
            factorial *=n;
            System.out.println(factorial);
            n-- ;
        }

    }
}