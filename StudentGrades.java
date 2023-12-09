import java.util.Scanner;
class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks for each subject
        System.out.println("Enter marks for four subjects:");

        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate total and aggregate
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double aggregate = totalMarks / 4.0;

        // Display total and aggregate
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Aggregate: " + aggregate);

        // Display grade based on aggregate
        System.out.print("Grade: ");
        if (aggregate > 75) {
            System.out.println("Distinction");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}
