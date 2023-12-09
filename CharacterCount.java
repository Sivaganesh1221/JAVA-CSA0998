import java.util.Scanner;

 class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        System.out.println("Enter characters. Enter * to stop.");

        char inputChar;
        do {
            System.out.print("Enter a character: ");
            inputChar = scanner.next().charAt(0);

            if (inputChar != '*') {
                if (Character.isUpperCase(inputChar)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(inputChar)) {
                    lowercaseCount++;
                } else if (Character.isDigit(inputChar)) {
                    digitCount++;
                }
            }

        } while (inputChar != '*');

        // Display results
        System.out.println("Uppercase Count: " + uppercaseCount);
        System.out.println("Lowercase Count: " + lowercaseCount);
        System.out.println("Digit Count: " + digitCount);
    }
}
