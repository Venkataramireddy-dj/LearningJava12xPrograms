package Core_Java_If_Else;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find positive or negative");

        int number =  scanner.nextInt();
        if(number>0){
            System.out.println("This is positive number");
        }else if(number<0){
            System.out.println("This is negative number");
        }else{
            System.out.println("This is not a negative or positive number");
        }


    }
}
