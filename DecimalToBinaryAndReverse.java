import java.util.Scanner;

class DecimalToBinaryAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryString = decimalToBinary(decimalNumber);

        // Print binary representation
        System.out.println("Binary representation: " + binaryString);

        // Reverse the binary representation
        String reversedBinaryString = reverseString(binaryString);

        // Print the reversed binary representation
        System.out.println("Reversed binary representation: " + reversedBinaryString);
    }

    static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Insert at the beginning to reverse the binary string
            decimalNumber /= 2;
        }

        return binary.toString();
    }

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
