package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class ATM_Withdral {
    //static int balance = 40000;
    public static void main(String[] args) {
        double accountBalance = 40000.00;
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Welcome to ATM Simulation");
        System.out.println("Current Balance: ₹" + accountBalance);

        // Step 2: Take user input for withdrawal amount
        System.out.print("Enter amount to withdraw: ₹");
        double withdrawalAmount = scanner.nextDouble();

        // Step 3: Check withdrawal conditions
        if (withdrawalAmount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        }
        else if (withdrawalAmount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100.");
        }
        else if (withdrawalAmount > accountBalance) {
            System.out.println("Error: Insufficient funds. Your balance is ₹" + accountBalance);
        }
        else {
            // Step 4: Deduct the amount
            accountBalance -= withdrawalAmount;

            // Step 5: Display success message and updated balance
            System.out.println("Withdrawal successful!");
            System.out.println("Dispensed: ₹" + withdrawalAmount);
            System.out.println("Remaining Balance: ₹" + accountBalance);
        }

    }
}
