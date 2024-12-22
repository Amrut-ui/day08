package day07;
import java.util.Scanner;

public class AverageStudents {
	

	public class AverageMarks {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter marks for subject 1: ");
	        int subject1 = scanner.nextInt();

	        System.out.print("Enter marks for subject 2: ");
	        int subject2 = scanner.nextInt();

	        System.out.print("Enter marks for subject 3: ");
	        int subject3 = scanner.nextInt();

	        scanner.close();

	        double average = calculateAverage(subject1, subject2, subject3);
	        System.out.println("Average marks: " + average);
	    }

	    public static double calculateAverage(int subject1, int subject2, int subject3) {
	        return (subject1 + subject2 + subject3) / 3.0;
	    }
	}

}
