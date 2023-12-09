import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String depositorName;
    private String accountType;
    private double balance;

    // constructors
    public BankAccount(int accountNumber, String depositorName, String accountType) {
        this.accountNumber = accountNumber;
        this.depositorName = depositorName;
        this.accountType = accountType;
        this.balance = 10000.00;
    }

   
     public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number: ");
        this.accountNumber = scanner.nextInt();
        System.out.println("Enter the Depositor name: ");
        this.depositorName = scanner.next();
        System.out.println("Enter account type (S/C/W): ");
        this.accountType = scanner.next().toUpperCase();
    }
     public void AccountDetails() { 
        System.out.println("The Account Number: "+this.accountNumber);  
        System.out.println("The Depositor name: "+this.depositorName);
        System.out.println("Account type (S/C/W): "+this.accountType);      
    }

    // deposit
    public void depositAmount(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Deposit amount must be greater than 0.");
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && this.balance - amount >= 500.00) {
            this.balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + this.balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(102, "Ragu", "W");
        account1.depositAmount(12000);
        account1.displayBalance();
        account1.withdrawAmount(8000);
        account1.displayBalance();
        account1.readAccountDetails();
        account1.AccountDetails();
    }
}
