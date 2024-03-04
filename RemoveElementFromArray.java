import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = { 10, 5, 8, 15, 7, 20 };
        int elementToRemove = 15;

        // Find the index of the element to remove
        int indexToRemove = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // If the element is found, create a new array without that element
        if (indexToRemove != -1) {
            int[] newArray = new int[originalArray.length - 1];

            // Copy elements before the element to remove
            System.arraycopy(originalArray, 0, newArray, 0, indexToRemove);

            // Copy elements after the element to remove
            System.arraycopy(originalArray, indexToRemove + 1, newArray, indexToRemove,
                    newArray.length - indexToRemove);

            // Display the original and modified arrays
            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
        } else {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }
    }
}
