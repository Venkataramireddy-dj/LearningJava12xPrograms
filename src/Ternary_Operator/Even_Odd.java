package Ternary_Operator;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = scanner.nextInt();
        String result = (num%2==0)?"It's even":"It's odd number";
        System.out.println(result);
    }



}
