package Switch_Case_And_Forloop;

import java.util.Scanner;

public class Days_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        while (true) {
            System.out.println("Enter a month number (1-12):");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    break;
                }
            } else {
                scanner.next();
                System.out.println("You are entering in a wrong format, please");// Clear invalid input
            }
        }

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        int days = 0;
        String monthName = "";

        switch (month) {
            case 1: monthName = "January"; days = 31; break;
            case 2:
                monthName = "February";
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3: monthName = "March"; days = 31; break;
            case 4: monthName = "April"; days = 30; break;
            case 5: monthName = "May"; days = 31; break;
            case 6: monthName = "June"; days = 30; break;
            case 7: monthName = "July"; days = 31; break;
            case 8: monthName = "August"; days = 31; break;
            case 9: monthName = "September"; days = 30; break;
            case 10: monthName = "October"; days = 31; break;
            case 11: monthName = "November"; days = 30; break;
            case 12: monthName = "December"; days = 31; break;
            default:
                System.out.println("Invalid month number!");
                return;
        }

        System.out.println(monthName + " " + year + " has " + days + " days");
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

}
