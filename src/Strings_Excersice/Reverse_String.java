package Strings_Excersice;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Reverse_With_Method();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse in :");
        String word = scanner.nextLine();
        String reverse = "";
        for(int i=word.length()-1;i>=0;i--){
           reverse+= word.charAt(i);
        }
        System.out.println(reverse);

    }
    public static void Reverse_With_Method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse :");
        String word1 = scanner.nextLine();
        StringBuilder s1 = new StringBuilder(word1);
        System.out.println(s1.reverse());
    }
}
