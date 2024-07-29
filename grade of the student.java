import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pythonMarks, cProgrammingMarks, mathMarks, physicsMarks;
        int total;
        double aggregate;
        String grade;
        System.out.print("Enter the marks in Python: ");
        pythonMarks = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        cProgrammingMarks = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        mathMarks = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        physicsMarks = scanner.nextInt();
        total = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
        aggregate = total / 4.0;
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60) {
            grade = "First Division";
        } else if (aggregate >= 50) {
            grade = "Second Division";
        } else if (aggregate >= 40) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + aggregate + "%");
        System.out.println("Grade: " + grade);
    }
}