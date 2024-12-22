package day07;

public class Areaofcircle {
	public class CircleArea {

	    public static void main(String[] args) {
	        double radius = 5.0; // Example radius
	        double area = calculateArea(radius);

	        System.out.println("Area of the circle: " + area);
	    }

	    public static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	}
}
