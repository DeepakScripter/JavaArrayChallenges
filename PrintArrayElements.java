import java.util.Arrays;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Method 1: Using a For Loop
        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(); // Move to the next line

        // Method 2: Using Enhanced For Loop (for-each)
        System.out.println("Using Enhanced For Loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println(); // Move to the next line

        // Method 3: Using Arrays.toString() Method
        System.out.println("Using Arrays.toString() Method:");
        System.out.println(Arrays.toString(numbers));

        // Method 4: Using Java Streams (Java 8 and later)
        System.out.println("Using Java Streams:");
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
    }
}
