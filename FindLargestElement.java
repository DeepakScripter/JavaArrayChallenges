public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 15, 7, 20 };

        // Assume the first element is the largest
        int maxElement = numbers[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }

        // Display the result
        System.out.println("The largest element in the array is: " + maxElement);
    }
}
