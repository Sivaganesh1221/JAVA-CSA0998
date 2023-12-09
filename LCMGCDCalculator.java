import java.util.Scanner;

 class LCMGCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

   
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        long lcm = findLCM(numbers);
        System.out.println("LCM: " + lcm);

        long gcd = findGCD(numbers);
        System.out.println("GCD: " + gcd);
    }

    static long findLCM(int[] arr) {
        long lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = (lcm * arr[i]) / findGCD(lcm, arr[i]);
        }
        return lcm;
    }

 
    static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long findGCD(int[] arr) {
        long gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = findGCD(gcd, arr[i]);
        }
        return gcd;
    }
}
