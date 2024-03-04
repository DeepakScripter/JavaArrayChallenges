public class FindSmallestElement {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 15, 7, 20 };

        // Assume the first element is the smallest
        int smallestElement = numbers[0];

        // Iterate through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallestElement) {
                smallestElement = numbers[i];
            }
        }

        // Display the result
        System.out.println("The smallest element in the array is: " + smallestElement);
    }
}
