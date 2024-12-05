package Com.trial;

import java.util.Arrays;

public class EvenNumberFilter {
    // Most Efficient Even Number Filtering Method
    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    // Alternative approach with manual iteration (potentially more memory-efficient for very large arrays)
    public static int[] filterEvenNumbersManual(int[] arr) {
        int count = 0;
        // First pass: count even numbers
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }

        // Create array of exact size needed
        int[] evenNumbers = new int[count];
        int index = 0;

        // Second pass: populate even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        return evenNumbers;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases from the original problem
        int[][] testCases = {
                {1, 2, 3, 4, 5},
                {10, 15, 20, 25},
                {7, 11, 13},
                {0, -2, -4}
        };

        for (int[] test : testCases) {
            System.out.println("Original Array: " + Arrays.toString(test));
            System.out.println("Even Numbers (Stream): " +
                    Arrays.toString(filterEvenNumbers(test)));
            System.out.println("Even Numbers (Manual): " +
                    Arrays.toString(filterEvenNumbersManual(test)));
            System.out.println();
        }
    }
}
