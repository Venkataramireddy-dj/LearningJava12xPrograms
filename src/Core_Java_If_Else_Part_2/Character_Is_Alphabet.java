package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Character_Is_Alphabet {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter a character from 'A-Z' or 'a - z' : ");
        char ch = scanner.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
    public static void another_Way(){
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }

    }
}
