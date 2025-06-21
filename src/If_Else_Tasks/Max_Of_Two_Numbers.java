package If_Else_Tasks;

import java.util.Scanner;

public class Max_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter first number");
        int num1 =  scanner.nextInt();
        System.out.println("ENter second number");
        int num2 =  scanner.nextInt();

        if(num1>num2){

            System.out.println(num1 + " is grater number");
        }
        else{
            System.out.println(num2 + " is grater number");
        }
    }
}
