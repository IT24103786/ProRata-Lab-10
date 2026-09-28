import java.util.Scanner;

public class IT24103786Lab10Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = sc.nextInt();

        // a) Validate the range using an assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

        // b) Determine the grade
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Verify the grade using an assertion
        assert ((mark >= 75 && grade == 'A')
                || (mark >= 60 && mark <= 74 && grade == 'B')
                || (mark >= 50 && mark <= 59 && grade == 'C')
                || (mark >= 40 && mark <= 49 && grade == 'D')
                || (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        sc.close();
    }
}