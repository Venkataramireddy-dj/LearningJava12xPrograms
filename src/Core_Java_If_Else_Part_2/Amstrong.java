package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }


        }
    public static boolean isArmstrong(int number){
        String numstr = Integer.toString(number);
        int digits = numstr.length();
        int sum = 0;
        for(char c : numstr.toCharArray()){
            int digit = Character.getNumericValue(c);
            sum += Math.pow(digit, digits);

        }
        return sum == number;
    }

    }

