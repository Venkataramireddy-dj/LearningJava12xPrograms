package Switch_Case_And_Forloop;

import java.util.Scanner;

public class Grade_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grades from these list : 'A','B','C','D','F'");
        String grade = scanner.next().toUpperCase();
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
