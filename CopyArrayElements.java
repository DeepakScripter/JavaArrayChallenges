import java.util.Arrays;

public class CopyArrayElements {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };

        // Using a loop to manually copy elements
        int[] destinationArray2 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray2[i] = sourceArray[i];
        }

        // Display the copied array
        System.out.println("Copied array using a loop: " + Arrays.toString(destinationArray2));
    }
}
/*
 * import java.util.Arrays;
 * 
 * public class CopyArrayElements {
 * public static void main(String[] args) {
 * int[] sourceArray = {1, 2, 3, 4, 5};
 * 
 * // Using System.arraycopy
 * int[] destinationArray1 = new int[sourceArray.length];
 * System.arraycopy(sourceArray, 0, destinationArray1, 0, sourceArray.length);
 * 
 * // Display the copied array
 * System.out.println("Copied array using System.arraycopy: " +
 * Arrays.toString(destinationArray1));
 * }
 * }
 */