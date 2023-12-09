
import java.util.*;

public class prtinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        
        System.out.print("Is the customer a senior citizen (y/n): ");
        char isSenior = input.next().charAt(0);
        
        double rateOfInterest;
        
        if (isSenior == 'y' || isSenior == 'Y') {
            rateOfInterest = 0.12; // 12% for senior citizens
        } else if (isSenior == 'n' || isSenior == 'N') {
            rateOfInterest = 0.10; // 10% for other customers
        } else {
            System.out.println("Invalid input for senior citizen status.");
            return; // Exit the program if invalid input
        }
        
        if (principal <= 0 || years <= 0) {
            System.out.println("Invalid input for principal amount or number of years.");
            return; // Exit the program if invalid input
        }
        
        double interest = principal * rateOfInterest * years;
        
        System.out.println("Interest: " + interest);
    }
}
