package Tasks.Java_Programming_Assesement;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        for(int i=1; i<=a; i++){
            System.out.print(i + " ");
        }
    }
}
