package Tasks.Java_Programming_Assesement;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day in number from 1 - 7");
        int day = scanner.nextInt();
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number. Please enter a number between 1 and 7.";
        };
        System.out.println(dayName);
    }
}
