package day07;

public class PerimiterOfTringle {
	public class TrianglePerimeter {

	    public static void main(String[] args) {
	        double side1 = 5.0;
	        double side2 = 3.0;
	        double side3 = 4.0;

	        double perimeter = calculatePerimeter(side1, side2, side3);

	        System.out.println("Perimeter of the triangle: " + perimeter);
	    }

	    public static double calculatePerimeter(double side1, double side2, double side3) {
	        return side1 + side2 + side3;
	    }
	}

}
