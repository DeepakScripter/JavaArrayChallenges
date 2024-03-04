import java.util.Arrays;

public class ArrayComparison {
     public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        // Using == for reference equality
        System.out.println("Using == for reference equality:");
        System.out.println("array1 == array2: " + (array1 == array2)); // false
        System.out.println("array1 == array3: " + (array1 == array3)); // true

        // Using Arrays.equals() for content equality
        System.out.println("\nUsing Arrays.equals() for content equality:");
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2)); // true
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3)); // true
    }
}
