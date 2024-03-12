import java.util.Scanner;

public class PalindromeArrayCheck {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is a palindrome
        boolean isPalindrome = isPalindromeArray(array);

        // Display the result
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to check if an array is a palindrome
    static boolean isPalindromeArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Compare elements from the outer ends towards the center
        while (left < right) {
            if (array[left] != array[right]) {
                // If elements at symmetric positions are not equal, it's not a palindrome
                return false;
            }
            left++;
            right--;
        }

        // If the loop completes without returning, the array is a palindrome
        return true;
    }
}
