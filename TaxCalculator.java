import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double taxableIncome = calculateTaxableIncome(income);
        double tax = calculateTax(taxableIncome);

        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax= " + tax);

        scanner.close();
    }

    private static double calculateTaxableIncome(double income) {
        double exemptionLimit = 250000;
        return Math.max(0, income - exemptionLimit);
    }

    private static double calculateTax(double taxableIncome) {
        double tax = 0;

        if (taxableIncome > 1000000) {
            tax = taxableIncome * 0.3;
        } else if (taxableIncome > 500000) {
            tax = taxableIncome * 0.2;
        } else if (taxableIncome > 250000) {
            tax = taxableIncome * 0.1;
        }

        return tax;
    }
}
