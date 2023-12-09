import java.util.Arrays;
class nm{

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {10, 5, 8, 15, 20, 3, 25};
        
        // Values for M and N
        int m = 2; // Mth maximum
        int n = 3; // Nth minimum

        // Find Mth maximum and Nth minimum
        int mthMax = findMthMaximum(numbers, m);
        int nthMin = findNthMinimum(numbers, n);

        // Calculate sum and difference
        int sum = mthMax + nthMin;
        int diff = mthMax - nthMin;

        // Display results
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println(m + "th Maximum: " + mthMax);
        System.out.println(n + "th Minimum: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }

    // Function to find the Mth maximum in an array
    private static int findMthMaximum(int[] arr, int m) {
        Arrays.sort(arr);
        // Check if m is within the bounds of the array
        if (m <= arr.length && m > 0) {
            return arr[arr.length - m];
        } else {
            // Handle invalid value of m
            System.out.println("Invalid value of M");
            return -1;
        }
    }

    // Function to find the Nth minimum in an array
    private static int findNthMinimum(int[] arr, int n) {
        Arrays.sort(arr);
        // Check if n is within the bounds of the array
        if (n <= arr.length && n > 0) {
            return arr[n - 1];
        } else {
            // Handle invalid value of n
            System.out.println("Invalid value of N");
            return -1;
        }
    }
}
