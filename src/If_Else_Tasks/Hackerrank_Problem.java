package If_Else_Tasks;

import java.util.Scanner;

public class Hackerrank_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1 :");
        int n1 = scanner.nextInt();
        System.out.println("Enter the side2 :");
        int n2 = scanner.nextInt();
        System.out.println("Enter the side3 :");
        int n3 = scanner.nextInt();
        if (n1==n2&&n1==n3){
            System.out.println("This is equilateral trialngle");

        } else if (n1==n2 || n2==n3 || n1==n3) {
            System.out.println("this is Isosceles triangle");
            
        }
        else {
            System.out.println("This is Scalene triangle");
        }
    }
}
