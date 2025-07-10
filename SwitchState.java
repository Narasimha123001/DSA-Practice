import java.util.Scanner;

public class SwitchState{
    
    public static void main(String[] args) {
        byte day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day : ");
        day  = scanner.nextByte();  
    

        switch (day) {
            case 1:
                System.out.println("Monday");    
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wensaday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
        scanner.close();
    }
   
}