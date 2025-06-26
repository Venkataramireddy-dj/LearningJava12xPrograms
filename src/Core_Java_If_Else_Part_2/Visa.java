package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Visa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = 0;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Please enter integer that to positive numbers :");
        }
        System.out.println("Enter Visa status : ");
        System.out.println("Please enter visa status either Valid or not Valid");
        String visa = null;
        if (scanner.hasNextLine()) {

            visa = scanner.next();
        } else {
            System.out.println("Please enter visa status as a string");
        }


        if (age >= 18 ) {
            if (visa.equalsIgnoreCase("Valid")){
                System.out.print("You are eligible for travel ");
            }else{
                System.out.print("You are not eligible for travel because your visa status is invalid ");
            }

        } else {
            System.out.print("You are not eligible for travel because your age ius less tahn 18");
        }

    }
}
