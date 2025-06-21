package Core_Java_If_Else;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find EVen or Odd");

        int num =  scanner.nextInt();
        if(num%2==0){
            System.out.println(num + "This is even number");
        }
        else{
            System.out.println(num + "This is odd number");
        }
    }
}
