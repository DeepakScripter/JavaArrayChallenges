import java.util.Scanner;

public class DynamicArrayLength {
    public static void main(String[] args) {
        // Input the length of the array dynamically
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        // Create an array of the specified length
        int[] dynamicArray = new int[arrayLength];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            dynamicArray[i] = scanner.nextInt();
        }

        // Print array elements and length
        System.out.println("\nArray elements:");
        for (int element : dynamicArray) {
            System.out.print(element + " ");
        }

        System.out.println("\nArray length: " + dynamicArray.length);

        // Close the scanner
        scanner.close();
    }
}
