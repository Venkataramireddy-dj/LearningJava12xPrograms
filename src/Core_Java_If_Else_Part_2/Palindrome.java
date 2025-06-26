package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word  = scanner.nextLine();
        String cleaned = word.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if(cleaned.equals(reversed)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is palindrome");
        }
    }
}
