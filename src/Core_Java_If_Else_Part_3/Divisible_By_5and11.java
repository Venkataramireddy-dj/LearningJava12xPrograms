package Core_Java_If_Else_Part_3;

import java.util.Scanner;

public class Divisible_By_5and11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's divisible by 5 and 11 ");
        int number = scanner.nextInt();
        if(number%5==0 && number%11==0){
            System.out.println(number + "is divisible by 5 and 11 ");
        }
        else{
            System.out.println(number + "is not divisible by 5 and 11 ");
        }
        scanner.close();
    }
}
