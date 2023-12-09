import java.util.Scanner;

public class EvenF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int prev = 0;
        int current = 1;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += current;
            }

            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Sum of even Fibonacci numbers up to " + n + ": " + sum);
    }
}