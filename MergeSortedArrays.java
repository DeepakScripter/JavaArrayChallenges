
import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Two sorted arrays to be merged
        int[] array1 = { 1, 3, 5, 7, 9 };
        int[] array2 = { 2, 4, 6, 8, 10, 12 };

        // Merging the two arrays
        int[] mergedArray = mergeSortedArrays(array1, array2);

        // Displaying the original arrays and the merged array
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Function to merge two sorted arrays
    static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        // Merge arrays while maintaining the sorted order
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy the remaining elements from both arrays (if any)
        while (i < size1) {
            mergedArray[k++] = array1[i++];
        }

        while (j < size2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
