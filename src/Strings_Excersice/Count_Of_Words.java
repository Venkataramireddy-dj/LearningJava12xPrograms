package Strings_Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Of_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Step 1: Trim and normalize all whitespace to a single space
        String cleaned = input.trim().replaceAll("\\s+", " ");

        // Step 2: Handle empty string case
        if (cleaned.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Step 3: Split by space and count words
            String[] words = cleaned.split(" ");
            System.out.println("Number of words: " + words.length);
        }


    }
}
