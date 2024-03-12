import java.util.Scanner;

public class SumOfDiagonalElements {

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

        // Calculate the sum of two diagonal elements
        int sumDiagonal = calculateSumOfDiagonal(matrix);

        // Display the sum of two diagonal elements
        System.out.println("Sum of two diagonal elements: " + sumDiagonal);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to calculate the sum of two diagonal elements in a 2-D array
    static int calculateSumOfDiagonal(int[][] matrix) {
        int sum = 0;

        // Iterate through the rows of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Sum the elements of the main diagonal and the opposite diagonal
            sum += matrix[i][i]; // Sum of the main diagonal elements
            sum += matrix[i][matrix.length - 1 - i]; // Sum of the opposite diagonal elements
        }

        // Adjust for the center element if the matrix has an odd number of rows/columns
        int centerIndex = matrix.length / 2;
        sum -= matrix[centerIndex][centerIndex];

        return sum;
    }
}
