import java.util.Scanner;

class CustomCharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to be printed: ");
        char characterToPrint = scanner.next().charAt(0);

        System.out.print("Max number of times printed: ");
        int maxTimes = scanner.nextInt();

        customCharacterPattern(characterToPrint, maxTimes);
    }

    static void customCharacterPattern(char character, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
