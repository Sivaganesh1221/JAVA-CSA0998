import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numerical value: ");
        int number = scanner.nextInt();

        String words = convertToWords(number);
        System.out.println("Output: " + words);

        scanner.close();
    }

    public static String convertToWords(int number) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String words = "";

        if (number == 0) {
            words = "Zero";
        } else {
            // Extract digits from the number
            int thousands = number / 1000;
            int hundreds = (number % 1000) / 100;
            int tensPart = (number % 100) / 10;
            int unitsPart = number % 10;

            if (thousands > 0) {
                words += units[thousands] + " Thousand ";
            }

            if (hundreds > 0) {
                words += units[hundreds] + " Hundred ";
            }

            if (tensPart == 1 && unitsPart > 0) {
                words += teens[unitsPart] + " ";
            } else {
                words += tens[tensPart] + " " + units[unitsPart] + " ";
            }
        }

        return words.trim();
    }
}
