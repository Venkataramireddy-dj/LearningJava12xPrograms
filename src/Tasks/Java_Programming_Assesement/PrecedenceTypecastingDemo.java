package Tasks.Java_Programming_Assesement;

public class PrecedenceTypecastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;
        System.out.println("Operator Precedence Examples:");
        int result1 = a + 5 * 3 - 2;  // Multiplication has higher precedence
        System.out.println("a + 5 * 3 - 2 = " + result1 + " (Multiplication done first)");

        double result2 = (a + 5) * (3 - b);  // Parentheses change precedence
        System.out.println("(a + 5) * (3 - b) = " + result2 + " (Parentheses evaluated first)");

        boolean result3 = a > 5 && b < 4.0 || a == 10;  // Logical operator precedence
        System.out.println("a > 5 && b < 4.0 || a == 10 = " + result3 +
                " (&& has higher precedence than ||)");
        System.out.println("Type Casting Examples:");

        // Implicit casting (widening conversion)
        double implicitResult = a + b;  // int a is automatically cast to double
        System.out.println("Implicit casting (a + b): " + implicitResult +
                " (int automatically promoted to double)");

        // Explicit casting (narrowing conversion)
        int explicitResult = (int)(a + b);  // double result cast to int
        System.out.println("Explicit casting ((int)(a + b)): " + explicitResult +
                " (double truncated to int)");

    }
}
