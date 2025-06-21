package Core_Java_If_Else;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a marks to let you the grade : ");
        int score = scanner.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("You have to enter a number between 0 to 100");
        } else {
            if (score >= 90 ) {
                System.out.println("Your grade is : A+ ");
            } else if (score >= 80 ) {
                System.out.println("Your grade is : A ");
            } else if (score >= 70) {
                System.out.println("Your grade is : B ");
            } else if (score >= 60 ) {
                System.out.println("Your grade is : C ");
            } else if (score >= 50 ) {
                System.out.println("Your grade is : D ");
            } else if (score >= 40 ) {
                System.out.println("Your grade is : E ");
            } else {
                System.out.println("Fail");
            }
        }
    }



}
