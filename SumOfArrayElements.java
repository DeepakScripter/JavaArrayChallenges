public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Display the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
