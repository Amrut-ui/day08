package day07;

public class PerimeterOfRectangle {
	public class RectanglePerimeter {

	    public static void main(String[] args) {
	        double length = 5.0;
	        double width = 3.0;

	        double perimeter = calculatePerimeter(length, width);

	        System.out.println("Perimeter of the rectangle: " + perimeter);
	    }

	    public static double calculatePerimeter(double length, double width) {
	        return 2 * (length + width);
	    }
	}

}
