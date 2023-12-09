import java.util.Arrays;
import java.util.Scanner;
 class NthLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input value of N
        System.out.print("Enter the value of N (Nth largest): ");
        int N = scanner.nextInt();

        // Find the Nth largest number
        int nthLargest = findNthLargest(array, N);

        // Display result
        if (nthLargest != Integer.MIN_VALUE) {
            System.out.println("The " + N + "th largest number is: " + nthLargest);
        } else {
            System.out.println("Invalid value of N or array is too small.");
        }
    }

    // Function to find the Nth largest number in an array
    private static int findNthLargest(int[] array, int N) {
        Arrays.sort(array);

        // Check if N is within the bounds of the array
        if (N > 0 && N <= array.length) {
            return array[array.length - N];
        } else {
            return Integer.MIN_VALUE; // Invalid value of N
        }
    }
}
