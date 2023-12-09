import java.util.Scanner;

class DecimalToBinaryOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get decimal number from user
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert to binary and octal
        String binaryEquivalent = decimalToBinary(decimalNumber);
        String octalEquivalent = decimalToOctal(decimalNumber);

        // Display results
        System.out.println("Binary Equivalent: " + binaryEquivalent);
        System.out.println("Octal Equivalent: " + octalEquivalent);
    }

    // Function to convert decimal to binary
    private static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Function to convert decimal to octal
    private static String decimalToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
