package Tasks.Java_Programming_Assesement;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Classify the number
        if (number > 0) {
            System.out.println(number + " is positive");
            System.out.println("💡 Explanation: Program identifies the number as positive");
        }
        else if (number < 0) {
            System.out.println(number + " is negative");
            System.out.println("💡 Explanation: Program identifies the number as negative");
        }
        else {
            System.out.println(number + " is zero");
            System.out.println("💡 Explanation: Program identifies the number as zero");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
