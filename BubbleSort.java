

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Unsorted Array: ");
        printArray(array);

        // Call bubbleSort method to sort the array
        bubbleSort(array);

        System.out.println("\nSorted Array: ");
        printArray(array);
    }

    // Method to perform bubble sort on an array
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop to traverse through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the elements of an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
