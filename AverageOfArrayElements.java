import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        // Input the number of elements in the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] numbers = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / n;

        // Display the result
        System.out.println("Average of array elements: " + average);

        // Close the scanner
        scanner.close();
    }
}
