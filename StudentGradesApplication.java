import java.util.Scanner;

// Class to represent a subject
class Subject {
    private String name;
    private double marks;

    public Subject(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
}

// Class to calculate total and aggregate
class TotalAndAggregate {
    private double total;
    private double aggregate;

    public void calculateTotalAndAggregate(Subject[] subjects) {
        for (Subject subject : subjects) {
            total += subject.getMarks();
        }

        aggregate = total / subjects.length;
    }

    public double getTotal() {
        return total;
    }

    public double getAggregate() {
        return aggregate;
    }
}

// Class to calculate grade based on aggregate
class GradeCalculator {
    public String calculateGrade(double aggregate) {
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60 && aggregate <= 75) {
            return "FIRST DIVISION";
        } else if (aggregate >= 50 && aggregate < 60) {
            return "SECOND DIVISION";
        } else if (aggregate >= 40 && aggregate < 50) {
            return "THIRD DIVISION";
        } else {
            return "FAIL";
        }
    }
}

// Composite class combining subjects, total, aggregate, and grade calculation
class Student extends TotalAndAggregate {
    private Subject[] subjects;
    private GradeCalculator gradeCalculator;

    public Student() {
        subjects = new Subject[6];
        gradeCalculator = new GradeCalculator();
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the marks in " + getSubjectName(i) + ": ");
            double marks = scanner.nextDouble();

            subjects[i] = new Subject(getSubjectName(i));
            subjects[i].setMarks(marks);
        }

        scanner.close();
    }

    private String getSubjectName(int index) {
        switch (index) {
            case 0:
                return "Python";
            case 1:
                return "C Programming";
            case 2:
                return "Mathematics";
            case 3:
                return "Physics";
            case 4:
                return "Chemistry";
            case 5:
                return "Professional Ethics";
            default:
                return "";
        }
    }

    public void calculateGrade() {
        calculateTotalAndAggregate(subjects);
        double aggregate = getAggregate();
        System.out.println("Total= " + getTotal());
        System.out.println("Aggregate = " + aggregate);
        System.out.println("Class: " + gradeCalculator.calculateGrade(aggregate));
    }
}

public class StudentGradesApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputMarks();
        student.calculateGrade();
    }
}
