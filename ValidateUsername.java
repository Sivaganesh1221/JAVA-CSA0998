import java.util.Scanner;

 class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a username from the user
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        // Check if the username is valid
        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username. Please follow the specified criteria.");
        }
    }

    // Function to check if a username is valid
    private static boolean isValidUsername(String username) {
        // Check if the username is not empty
        if (username.isEmpty()) {
            return false;
        }

        // Check if the username contains only alphanumeric characters
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        // Check if the length of the username is between 5 and 15 characters
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }

        // Additional criteria can be added based on your requirements

        // If all criteria pass, the username is considered valid
        return true;
    }
}
