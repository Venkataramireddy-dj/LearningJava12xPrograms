package Tasks.Java_Programming_Assesement;

public class Multiplication {
    public static void main(String[] args) {
        for (int table = 1; table <= 5; table++) {
            System.out.println("\nTable of " + table + ":");

            // Inner loop for multipliers 1 through 10
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d x %d = %d", table, multiplier, table * multiplier);

                // Add tab separator except after last multiplication
                if (multiplier < 10) {
                    System.out.print("\t");
                }

                // New line after every 5 multiplications for better formatting
                if (multiplier % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
