package Tasks.Java_Programming_Assesement;

public class ArthmeticOperationsDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        double x = 10.5;
        double y = 3.2;
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("x / y = " + (x / y));
        System.out.println("a % b = " + (a % b));
        System.out.println("Assignment Operations:");
        // Simple assignment
        int result = a;
        System.out.println("result = a → result = " + result);

        // Addition assignment
        result += b;  // equivalent to result = result + b
        System.out.println("result += b → result = " + result);

        // Subtraction assignment
        result -= 3;  // equivalent to result = result - 3
        System.out.println("result -= 3 → result = " + result);

        // Multiplication assignment
        result *= 2;  // equivalent to result = result * 2
        System.out.println("result *= 2 → result = " + result);

        // Division assignment
        result /= 4;  // equivalent to result = result / 4
        System.out.println("result /= 4 → result = " + result);

        // Modulus assignment
        result %= 3;  // equivalent to result = result % 3
        System.out.println("result %= 3 → result = " + result);
    }
}
