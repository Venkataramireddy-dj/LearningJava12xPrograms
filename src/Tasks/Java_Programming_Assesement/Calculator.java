package Tasks.Java_Programming_Assesement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number : ");
        double a = scanner.nextDouble();
        System.out.print("Enter First number : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the operation from the following : + , - , * , / : ");
        String operation = scanner.next();

        switch(operation){
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            case "%" :
                System.out.println("Invalid Operation");
                break;

            default:
                System.out.println("Error : Division by zero");

        }

    }
}
