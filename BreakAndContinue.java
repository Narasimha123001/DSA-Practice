public class BreakAndContinue{
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;

        for(int num : number){
            if(num == target){
                System.out.println("found target:"+num);
                break;
            }
                System.out.println("Checking:"+num);
        }

        for(int num : number){
            if(num % 2==0){
                continue;
            }
            System.out.println(num);
        }
    }
}