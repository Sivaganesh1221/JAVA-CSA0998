import java.util.Scanner;

 class BonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee: ");
        char grade = scanner.next().charAt(0); // Assuming the grade is a single character

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        // Calculate bonus based on grade and salary conditions
        double bonus = 0.0;

        if (grade == 'A') {
            bonus = 0.05 * salary; // 5% bonus for grade A
        } else if (grade == 'B') {
            bonus = 0.10 * salary; // 10% bonus for grade B
        }

        // Additional 2% bonus for salary less than $10,000
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

        // Calculate total amount to be paid
        double totalAmount = salary + bonus;

        // Display results
        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid: " + totalAmount);
    }
}
