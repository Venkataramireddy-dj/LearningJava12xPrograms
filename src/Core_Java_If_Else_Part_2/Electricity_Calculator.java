package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Electricity_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter the units consumed");
        double cost;
        int power = 0;
        if (scanner.hasNextInt()) {
            power = scanner.nextInt();
        } else {
            System.out.println("enter the units in integers ");
        }
        if (power <= 100) {
            cost = power * 0.50;
            System.out.println(cost);
        } else if (power>100 && power <= 200){
            cost = power * 0.75;
            System.out.println(cost);
        }else if (power>200 && power <= 300){
            cost = power * 1.20;
            System.out.println(cost);
        }else{
            cost = power * 1.50;
            System.out.println(cost);
        }

    }
}
