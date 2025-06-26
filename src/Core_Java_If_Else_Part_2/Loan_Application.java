package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Loan_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = 0;
        if (scanner.hasNextInt()) {
            //System.out.print("Enter your age :");
            age = scanner.nextInt();
        } else {
            System.out.println("Can you enter the inputs in integer format");
        }
        System.out.print("Enter your salary :");
        double salary = 0;
        if (scanner.hasNextInt()) {
            //System.out.print("Enter your age :");
            salary = scanner.nextDouble();
        } else {
            System.out.println("Can you enter the inputs in integer format");
        }
        System.out.print("Enter your credit score :");
        int credit_score = 0;
        if (scanner.hasNextInt()) {
            //System.out.print("Enter your age :");
            credit_score = scanner.nextInt();
        } else {
            System.out.println("Can you enter the inputs in integer format");
        }


        if (age <= 18 || age > 80) {
            System.out.println("You are not eligible for loan and your age must be present in 18 to 80");
        } else if (salary <= 30000) {
            System.out.println("You are not eligible for loan and your salary must be greater tahn 30000");
        } else if (credit_score < 650 || credit_score > 850) {
            System.out.println("You are not eligible for loan and your credit score must lay between 650 and 850");
        } else {
            System.out.println("You are eligible for loan and your loan can be processed soon");
        }






    }

}
