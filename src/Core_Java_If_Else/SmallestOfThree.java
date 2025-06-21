package Core_Java_If_Else;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();


        double smallest;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        }
        else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        }
        else {
            smallest = num3;
        }

        // Display the result
        System.out.println("The smallest number is: " + smallest);

    }
}
