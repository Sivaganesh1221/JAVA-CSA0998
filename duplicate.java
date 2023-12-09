import java.util.Scanner;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int length = removeDuplicates(arr);
        
        System.out.println("Non-duplicate items:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[length - 1];
                    length--;
                    j--;
                }
            }
        }
        return length;
    }
}
