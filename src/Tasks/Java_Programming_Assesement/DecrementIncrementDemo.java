package Tasks.Java_Programming_Assesement;

public class DecrementIncrementDemo {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Original value: " + i);

        // Pre-increment (++i)
        System.out.println("\nPre-increment operation:");
        System.out.println("Before operation: " + i);
        System.out.println("During operation (++i): " + (++i)); // Increments first, then returns
        System.out.println("After operation: " + i);

        // Post-increment (i++)
        System.out.println("\nPost-increment operation:");
        System.out.println("Before operation: " + i);
        System.out.println("During operation (i++): " + (i++)); // Returns first, then increments
        System.out.println("After operation: " + i);

        // Reset value for decrement demonstrations
        i = 5;
        System.out.println("\nReset value to: " + i);

        // Pre-decrement (--i)
        System.out.println("\nPre-decrement operation:");
        System.out.println("Before operation: " + i);
        System.out.println("During operation (--i): " + (--i)); // Decrements first, then returns
        System.out.println("After operation: " + i);

        // Post-decrement (i--)
        System.out.println("\nPost-decrement operation:");
        System.out.println("Before operation: " + i);
        System.out.println("During operation (i--): " + (i--)); // Returns first, then decrements
        System.out.println("After operation: " + i);
    }
}
