package Ternary_Operator;

import java.util.Scanner;

public class Minor_Major {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String result = (age<18)?"Minor": (age<65)?"adult":"Senior setizen";
        System.out.println(result);
    }
}
