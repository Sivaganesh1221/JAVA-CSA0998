import java.util.Scanner;

 class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define denominations
        int[] denominations = {2000, 500, 200, 100};

        // Variables to store user input
        int totalNotes, denomination, notes;

        // Variable to store total available balance
        int totalBalance = 0;

        // Get user input for each denomination
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            denomination = scanner.nextInt();

            // Check if the entered denomination is valid
            if (isValidDenomination(denominations, denomination)) {
                System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
                notes = scanner.nextInt();

                // Calculate and add the value of the denomination to the total balance
                totalBalance += denomination * notes;
            } else {
                // Handle invalid denomination
                System.out.println("Invalid denomination. Please enter a valid denomination.");
                i--; // Decrement i to re-enter the current denomination
            }
        }

        // Display the total available balance
        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }

    // Function to check if the entered denomination is valid
    private static boolean isValidDenomination(int[] denominations, int denomination) {
        for (int validDenomination : denominations) {
            if (validDenomination == denomination) {
                return true;
            }
        }
        return false;
    }
}
