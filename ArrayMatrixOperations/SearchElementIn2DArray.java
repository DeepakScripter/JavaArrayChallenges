import java.util.Scanner;

public class SearchElementIn2DArray {

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

        // Prompt the user to enter the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Search for the element in the 2-D array
        boolean isElementFound = searchElement(matrix, target);

        // Display the result based on whether the element is found or not
        if (isElementFound) {
            System.out.println("Element found in the 2-D array.");
        } else {
            System.out.println("Element not found in the 2-D array.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to search for an element in a 2-D array
    static boolean searchElement(int[][] matrix, int target) {
        // Iterate through each element of the 2-D array
        for (int[] row : matrix) {
            for (int element : row) {
                // If the element matches the target, return true
                if (element == target) {
                    return true;
                }
            }
        }
        // If the element is not found, return false
        return false;
    }
}
