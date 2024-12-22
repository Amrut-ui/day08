package day07;

public class SqureAndQubes {
	public class SquareAndCube {

	    public static void main(String args) {
	        int number = 5; // Example number

	        int square = calculateSquare(number);
	        int cube = calculateCube(number);

	        System.out.println("Number: " + number);
	        System.out.println("Square: " + square);
	        System.out.println("Cube: " + cube);
	    }

	    public static int calculateSquare(int num) {
	        return num * num;
	    }

	    public static int calculateCube(int num) {
	        return num * num * num;
	    }
	}

}
