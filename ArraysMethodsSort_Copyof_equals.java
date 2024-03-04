import java.util.Arrays;

public class ArraysMethodsSort_Copyof_equals {
    public static void main(String[] args) {
        // Example of sort() method
        int[] numbersToSort = {5, 2, 8, 1, 7};
        Arrays.sort(numbersToSort);
        System.out.println("Sorted array: " + Arrays.toString(numbersToSort));

        // Example of equals() method
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + areEqual);

        // Example of copyOf() method
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = Arrays.copyOf(sourceArray, 3);
        System.out.println("Copied array: " + Arrays.toString(destinationArray));
    }
}
