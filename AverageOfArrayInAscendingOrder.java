import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayInAscendingOrder {
    public static void main(String[] args) {
        // Input array elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / n;

        // Display the sorted array and average
        System.out.println("\nArray elements in ascending order: " + Arrays.toString(numbers));
        System.out.println("Average of array elements: " + average);

        // Close the scanner
        scanner.close();
    }
}
