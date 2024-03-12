import java.util.Scanner;

public class SumAverageOf2DArray {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2-D array based on user input for rows and columns
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the elements of the 2-D array
        System.out.println("Enter the elements of the 2-D array:");

        // Populate the 2-D array with user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of all elements in the 2-D array
        int sum = calculateSum(matrix);

        // Calculate the average of all elements in the 2-D array
        double average = calculateAverage(matrix);

        // Display the sum and average of all elements
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to calculate the sum of all elements in a 2-D array
    static int calculateSum(int[][] matrix) {
        int sum = 0;
        // Iterate through each element of the 2-D array and add it to the sum
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    // Function to calculate the average of all elements in a 2-D array
    static double calculateAverage(int[][] matrix) {
        // Calculate the total number of elements in the 2-D array
        int totalElements = matrix.length * matrix[0].length;
        // Calculate the sum of all elements
        int sum = calculateSum(matrix);
        // Calculate the average by dividing the sum by the total number of elements
        return (double) sum / totalElements;
    }
}
