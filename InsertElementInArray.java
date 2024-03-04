import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int elementToInsert = 10;
        int positionToInsert = 2; // Insert at index 2 (0-based index)

        // Check if the position is valid
        if (positionToInsert < 0 || positionToInsert > originalArray.length) {
            System.out.println("Invalid position to insert");
            return;
        }

        // Create a new array with one extra element
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements before the insertion point
        System.arraycopy(originalArray, 0, newArray, 0, positionToInsert);

        // Insert the new element
        newArray[positionToInsert] = elementToInsert;

        // Copy elements after the insertion point
        System.arraycopy(originalArray, positionToInsert, newArray, positionToInsert + 1,
                originalArray.length - positionToInsert);

        // Display the result
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
