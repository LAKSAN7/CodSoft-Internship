import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int No_Of_Subjects = scanner.nextInt();
        int[] marks = new int[No_Of_Subjects];
        for (int i = 0; i < No_Of_Subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double average = (double) totalMarks /No_Of_Subjects;
        char grade = calculateGrade(average);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
    public static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }


	}

}
