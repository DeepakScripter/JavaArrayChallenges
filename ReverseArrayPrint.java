public class ReverseArrayPrint {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Print array elements in reverse order
        System.out.println("Array elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
