package Switch_Case_And_Forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int fact = 1;


        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if(number==0) {
                System.out.println("Factorial is"+ fact);
            }
            else if(number<0){
                System.out.println("Factorial for negative numbers is not possible");
            }
            else {
                for (int i= number ; i > 0 ; i--){
                    fact = fact*i;

                }
                System.out.println("Factorial =" +fact);
            }
        }
        else {
            System.out.println("Invalid format");
        }
    }
}
