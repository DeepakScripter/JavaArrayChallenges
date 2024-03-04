import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Input the element to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; // Exit the loop if the element is found
            }
        }

        // Display the result
        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
