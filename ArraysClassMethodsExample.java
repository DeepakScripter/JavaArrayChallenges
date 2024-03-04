import java.util.Arrays;
import java.util.List;

public class ArraysClassMethodsExample {
    public static void main(String[] args) {
        // One-dimensional array
        int[] oneDimensionalArray = { 1, 2, 3, 4, 5 };

        // Using toString() method
        String oneDArrayString = Arrays.toString(oneDimensionalArray);
        System.out.println("One-dimensional array using toString(): " + oneDArrayString);

        // Using asList() method
        List<int[]> asListResult = Arrays.asList(oneDimensionalArray);
        System.out.println("Result of asList() for one-dimensional array: " + asListResult);

        // Multi-dimensional array
        int[][] multiDimensionalArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Using deepToString() method
        String multiDArrayString = Arrays.deepToString(multiDimensionalArray);
        System.out.println("\nMulti-dimensional array using deepToString():\n" + multiDArrayString);
    }
}
