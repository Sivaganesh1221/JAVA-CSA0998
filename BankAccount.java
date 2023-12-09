import java.util.Scanner;

class BankAccount {
    protected String accountType;
    protected double balance;

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance - amount >= getMinimumBalance()) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds. Minimum balance violation.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    protected double getMinimumBalance() {
        return 0; // Default minimum balance, can be overridden in derived classes
    }
}

class SavingsAccount extends BankAccount {
    protected final double MINIMUM_BALANCE = 1500;

    public SavingsAccount(double initialBalance) {
        super("Savings Account", initialBalance);
    }

    @Override
    protected double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }
}

class CurrentAccount extends BankAccount {
    private final double MINIMUM_BALANCE = 1000;

    public CurrentAccount(double initialBalance) {
        super("Current Account", initialBalance);
    }

    @Override
    protected double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }
}

class SeniorCitizenAccount extends SavingsAccount {
    private final double SENIOR_CITIZEN_INTEREST_RATE = 0.05;

    public SeniorCitizenAccount(double initialBalance) {
        super(initialBalance);
        accountType = "Senior Citizen Savings Account";
    }

    @Override
    protected double getMinimumBalance() {
        // Senior Citizen account has the same minimum balance as a regular Savings Account
        return MINIMUM_BALANCE;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applySeniorCitizenInterest();
    }

    private void applySeniorCitizenInterest() {
        double interest = balance * SENIOR_CITIZEN_INTEREST_RATE;
        balance += interest;
        System.out.println("Senior Citizen Interest Applied: " + interest);
        displayBalance();
    }
}

class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.displayBalance();

        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount(1500);
        currentAccount.displayBalance();

        // Create a Senior Citizen Account
        SeniorCitizenAccount seniorCitizenAccount = new SeniorCitizenAccount(3000);
        seniorCitizenAccount.displayBalance();

        // Demonstrate operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        currentAccount.deposit(300);
        currentAccount.withdraw(150);

        seniorCitizenAccount.deposit(1000);
        seniorCitizenAccount.withdraw(500);

        scanner.close();
    }
}
