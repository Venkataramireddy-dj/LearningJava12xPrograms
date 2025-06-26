package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Triangle_Side {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("This is not form a triangle");
        } else if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("It's an equilateral triangle.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("It's an isosceles triangle.");
            } else {
                System.out.println("It's a scalene triangle.");
            }
        }

    }
    }



