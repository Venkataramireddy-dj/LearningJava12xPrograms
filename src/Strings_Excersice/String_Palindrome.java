package Strings_Excersice;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check whether it's palindrome or not");
        String word = scanner.nextLine();
        String cleaned = word.toLowerCase().replaceAll("\\s+", "");
        System.out.println(cleaned);

        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }
}
