import java.util.Scanner;

class Simple{
public static void main(String[] args) {
        double principalAmount,interest;
        int years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        System.out.print("Is the customer a senior citizen (y/n): ");
        String isSeniorCitizen = scanner.next();
        interest = calculateSimpleInterest(principalAmount, years, isSeniorCitizen);
        System.out.println("Interest: " + interest);
    }

    public static double calculateSimpleInterest(double principal, int years, String isSeniorCitizen) {
        double rateOfInterest = (isSeniorCitizen.equalsIgnoreCase("y")) ? 0.12 : 0.10;
        return principal * rateOfInterest * years;
    }
}