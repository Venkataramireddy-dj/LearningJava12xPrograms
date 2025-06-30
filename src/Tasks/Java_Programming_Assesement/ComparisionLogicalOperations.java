package Tasks.Java_Programming_Assesement;

public class ComparisionLogicalOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));      // Equal to
        System.out.println("a != b: " + (a != b));      // Not equal to
        System.out.println("a < b: " + (a < b));        // Less than
        System.out.println("a > b: " + (a > b));        // Greater than
        System.out.println("a <= b: " + (a <= b));      // Less than or equal to
        System.out.println("a >= b: " + (a >= b));      // Greater than or equal to

        System.out.println("-----------------------------");
        System.out.println("Logical Operators:");
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));  // AND
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));  // OR
        System.out.println("!(a > b): " + (!(a > b)));
    }
}
