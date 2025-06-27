package Core_Java_If_Else_Part_3;

import java.util.Scanner;

public class Age_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age : ");
     //   int age = 0;
        if (scanner.hasNextInt()) {
           int age = scanner.nextInt();

            if (age>= 0 && age <= 12) {
                System.out.println("You are child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("You are teaneager");
            } else if (age >= 20 && age <= 64) {
                System.out.println("You are Adult");
            } else if (age >= 65) {
                System.out.println("You are Senior Citizen");
            } else {
                System.out.println("Please enter your age that is starting from 0");
            }
        }else{
            System.out.println("Enter your age in integers");
        }


    }
}
