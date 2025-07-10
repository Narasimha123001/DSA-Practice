import java.util.Scanner;

public class MarksConditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your Marks: ");
        int marks = scanner.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
            if(marks == 98){
                System.out.println("super");
            }
        }
        else if(marks >= 70 && marks < 90){
            System.out.println("Grade B");
        }
        else if(marks >= 50 && marks < 70){
            System.out.println("Grade C");
        }
        else if(marks >= 35 && marks < 50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
         scanner.close();
    }
}