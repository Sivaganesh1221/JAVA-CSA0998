import java.util.Scanner;

public class IntegerToRoman {

    private static final int[] values = {
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
    };

    private static final String[] symbols = {
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV",
        "I"
    };

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        if (userInput > 0 && userInput < 4000) {
            String romanNumeral = intToRoman(userInput);
            System.out.println("Roman numeral representation: " + romanNumeral);
        } else {
            System.out.println("Please enter a number between 1 and 3999.");
        }

        scanner.close();
    }
}
