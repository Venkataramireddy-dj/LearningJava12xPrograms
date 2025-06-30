package Tsk24june_Loops;

import java.util.Scanner;

public class Multiplication_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the multiplication of a number : ");
        int num = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "x" + i + "=" + num*i);
        }
    }
}
