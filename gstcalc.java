import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class gstcalc {

    public static boolean isValidGSTNo(String gstCode) {
        String regex = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
                + "[A-Z]{1}[1-9A-Z]{1}"
                + "Z[0-9A-Z]{1}$";
        Pattern pattern = Pattern.compile(regex);

        if (gstCode == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(gstCode);

        return matcher.matches();
    }

    public static double calculateGST(double baseAmount, double gstRate) {
        return (baseAmount * gstRate) / 100.0;
    }

    public static double getTotalAmount(double baseAmount, double gstAmount) {
        return baseAmount + gstAmount;
    }

    static class ItemDetails {
        int itemNumber;
        double quantity;
        double unitPrice;
        double baseAmount;
        double gstRate;
        double gstAmount;
        double totalAmount;
        int selectedSchedule;

        public ItemDetails(int itemNumber, double quantity, double unitPrice, double baseAmount, double gstRate, double gstAmount, double totalAmount, int selectedSchedule) {
            this.itemNumber = itemNumber;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.baseAmount = baseAmount;
            this.gstRate = gstRate;
            this.gstAmount = gstAmount;
            this.totalAmount = totalAmount;
            this.selectedSchedule = selectedSchedule;
        }

        public String getDetailedInfo() {
            StringBuilder details = new StringBuilder();
            details.append("********** Item ").append(itemNumber).append(" Details **********\n");
            details.append("Quantity: ").append(quantity).append("\n");
            details.append("Unit Price: Rs. ").append(unitPrice).append("\n");
            details.append("GST Schedule: ").append(getGSTSchedule(selectedSchedule)).append("\n");
            details.append("GST Rate: ").append(gstRate).append("%\n");
            details.append("GST Amount: Rs. ").append(gstAmount).append("\n");
            details.append("Total Amount (including GST): Rs. ").append(totalAmount).append("\n");
            details.append("******************************\n");
            return details.toString();
        }
    }

    public static double getGSTRate(int schedule) {
        switch (schedule) {
            case 1:
                return 0.0;  // Nil rate
            case 2:
                return 0.25;
            case 3:
                return 3.0;
            case 4:
                return 5.0;
            case 5:
                return 12.0;
            case 6:
                return 18.0;
            case 7:
                return 28.0;
            default:
                return 0.0;  // Default to Nil rate for invalid schedule
        }
    }

    public static String getGSTSchedule(int schedule) {
        switch (schedule) {
            case 1:
                return "Nil Rate";
            case 2:
                return "0.25% Rate";
            case 3:
                return "3% Rate";
            case 4:
                return "5% Rate";
            case 5:
                return "12% Rate";
            case 6:
                return "18% Rate";
            case 7:
                return "28% Rate";
            default:
                return "Invalid Schedule";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Validate GST Code");
            System.out.println("2. Calculate GST");
            System.out.println("3. Exit");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    // Validate GST code
                    System.out.println("Enter the GST code to validate:");
                    String gstCode = scanner.next();
                    if (isValidGSTNo(gstCode)) {
                        System.out.println("Valid GST code.");
                    } else {
                        System.out.println("Invalid GST code format.");
                    }
                    break;

                case 2:
                    // Calculate GST for multiple items
                    System.out.println("Enter the number of items:");
                    int numItems = scanner.nextInt();

                    List<ItemDetails> items = new ArrayList<>();

                    for (int i = 1; i <= numItems; i++) {
                        System.out.println("********** Item " + i + " **********");
                        System.out.println("Enter the quantity:");
                        double quantity = scanner.nextDouble();
                        System.out.println("Enter the unit price:");
                        double unitPrice = scanner.nextDouble();

                        double baseAmount = quantity * unitPrice;

                        System.out.println("Choose GST Schedule for Item " + i + ":");
                        System.out.println("1. Nil Rate");
                        System.out.println("2. 0.25% Rate");
                        System.out.println("3. 3% Rate");
                        System.out.println("4. 5% Rate");
                        System.out.println("5. 12% Rate");
                        System.out.println("6. 18% Rate");
                        System.out.println("7. 28% Rate");

                        int selectedSchedule = scanner.nextInt();

                        double gstRate = getGSTRate(selectedSchedule);
                        double gstAmount = calculateGST(baseAmount, gstRate);
                        double totalAmount = getTotalAmount(baseAmount, gstAmount);

                        items.add(new ItemDetails(i, quantity, unitPrice, baseAmount, gstRate, gstAmount, totalAmount, selectedSchedule));
                    }

                    // Display overall invoice
                    System.out.println("Do you want to display detailed information for each item? (Y/N)");
                    char displayOption = scanner.next().charAt(0);
                    if (displayOption == 'Y' || displayOption == 'y') {
                        displayOverallInvoiceWithDetails(items);
                    } else {
                        displayOverallInvoice(items);
                    }

                    // Ask user if they want to print the invoice to a file
                    System.out.println("Do you want to print the detailed invoice to a file? (Y/N)");
                    char printOption = scanner.next().charAt(0);
                    if (printOption == 'Y' || printOption == 'y') {
                        System.out.println("Enter the file name (e.g., invoice.txt):");
                        String fileName = scanner.next();
                        printInvoiceToFile(items, fileName);
                    }

                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose either 1, 2, or 3.");
            }
        }

        // Close the Scanner resource
        scanner.close();
    }

    public static void printInvoiceToFile(List<ItemDetails> items, String fileName) {
        try (PrintStream fileOutput = new PrintStream(new File(fileName))) {
            PrintStream originalOut = System.out;
            System.setOut(fileOutput);

            displayOverallInvoiceWithDetails(items);
            System.setOut(originalOut);

            System.out.println("Invoice printed to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            System.setOut(new PrintStream(System.out));
        }
    }

    public static void displayOverallInvoice(List<ItemDetails> items) {
        System.out.println("********** Overall Invoice **********");

        for (ItemDetails item : items) {
            System.out.println("Item " + item.itemNumber + ": Rs. " + item.totalAmount);
        }

        double overallTotalAmount = items.stream().mapToDouble(item -> item.totalAmount).sum();

        System.out.println("Overall Total Amount (including GST) for all items: Rs. " + overallTotalAmount);
        System.out.println("*************************************");
    }

    public static void displayOverallInvoiceWithDetails(List<ItemDetails> items) {
        System.out.println("********** Overall Invoice with Details **********");

        for (ItemDetails item : items) {
            System.out.print(item.getDetailedInfo());
        }

        double overallTotalAmount = items.stream().mapToDouble(item -> item.totalAmount).sum();

        System.out.println("Overall Total Amount (including GST) for all items: Rs. " + overallTotalAmount);
        System.out.println("*************************************");
    }
}
