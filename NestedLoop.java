public class NestedLoop {
    public static void main(String[] args) {
        for(int i= 0 ; i <= 3; i++){
            for(int j =0; j<=3; j++){
                int sum = i+j;
                System.out.println("i = "+i+", j = "+j+" => " +sum);
            }
        }
    }
}
