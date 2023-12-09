import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove vowels from the string
        String stringWithoutVowels = removeVowels(inputString);

        // Display the modified string
        System.out.println("String after removing vowels: " + stringWithoutVowels);
    }

    // Function to remove vowels from a string
    private static String removeVowels(String str) {
        // Using regular expression to replace vowels with an empty string
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
