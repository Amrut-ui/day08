package day07;
import java.util.Scanner;


public class CheckPositiveNegitive {
	
	

	    public static void main(String args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        String result = checkNumber(number);
	        System.out.println(result);

	        scanner.close();
	    }

	    public static String checkNumber(int num) {
	        if (num > 0) {
	            return "Positive";
	        } else if (num < 0) {
	            return "Negative";
	        } else {
	            return "Zero";
	        }
	    }
	}

