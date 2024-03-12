public class ArrayOperations {

    // Static nested class: Statistics
    public static class Statistics {

        // Method to calculate the mean of an array
        public static double mean(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }

            int sum = 0;
            for (int num : array) {
                sum += num;
            }

            return (double) sum / array.length;
        }

        // Method to calculate the median of an array
        public static double median(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }

            // Sort the array
            int[] sortedArray = array.clone();
            java.util.Arrays.sort(sortedArray);

            // Calculate the median
            int middle = sortedArray.length / 2;
            if (sortedArray.length % 2 == 0) {
                // If the array length is even, take the average of the middle two elements
                return (sortedArray[middle - 1] + sortedArray[middle]) / 2.0;
            } else {
                // If the array length is odd, return the middle element
                return sortedArray[middle];
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 7, 6 };

        // Using Statistics class to calculate mean and median
        System.out.println("Mean: " + Statistics.mean(numbers));
        System.out.println("Median: " + Statistics.median(numbers));
    }
}
