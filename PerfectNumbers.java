import java.util.Scanner;
class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 0; // Count of perfect numbers
        int number = 1; // Start checking from the first positive integer

        while (count < n) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Function to check if a number is a perfect number
    private static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }

        int sum = 1; // Initialize sum with 1 as every number is divisible by 1

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
