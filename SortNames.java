import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input names from the user
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        // Ask the user for sorting preference
        System.out.print("Enter 'A' for Ascending or 'D' for Descending order: ");
        char sortOrder = scanner.next().charAt(0);

        // Sort the names based on user's choice
        if (sortOrder == 'A' || sortOrder == 'a') {
            Collections.sort(names); // Ascending order
        } else if (sortOrder == 'D' || sortOrder == 'd') {
            Collections.sort(names, Collections.reverseOrder()); // Descending order
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D' for sorting order.");
            return;
        }

        // Display the sorted names
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
