package Tasks.Java_Programming_Assesement;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers separated by spaces: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // Print the result
        System.out.println("Largest number is: " + largest);

        // Explanation message
        if (num1 == num2 && num2 == num3) {
            System.out.println("💡 Explanation: All three numbers are equal (" + largest + ")");
        } else if (num1 == largest && num2 == largest) {
            System.out.println("💡 Explanation: First two numbers are equal and largest (" + largest + ")");
        } else if (num1 == largest && num3 == largest) {
            System.out.println("💡 Explanation: First and third numbers are equal and largest (" + largest + ")");
        } else if (num2 == largest && num3 == largest) {
            System.out.println("💡 Explanation: Last two numbers are equal and largest (" + largest + ")");
        } else {
            System.out.println("💡 Explanation: Program finds " + largest + " as the largest among the three numbers");
        }

        // Close the scanner
        scanner.close();
    }
}
