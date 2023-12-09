import java.util.Scanner;

 class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input a character to search
        System.out.print("Enter a character to search: ");
        char targetChar = scanner.next().charAt(0);

        // Search for the character in the string
        int index = findCharacterIndex(inputString, targetChar);

        // Display the result
        if (index != -1) {
            System.out.println("Character '" + targetChar + "' found at index: " + index);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }
    }

    // Function to find the index of a character in a string
    private static int findCharacterIndex(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        // If the character is not found, return -1
        return -1;
    }
}
