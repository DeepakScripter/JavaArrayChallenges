import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        // Input array elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        Integer[] numbers = new Integer[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Display the sorted array in descending order
        System.out.println("\nArray elements in descending order: " + Arrays.toString(numbers));

        // Close the scanner
        scanner.close();
    }
}
