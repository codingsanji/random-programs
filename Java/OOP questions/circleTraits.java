package Java;
import java.util.*;

class Circle{
	double radius;
	public Circle(double radius) {
        this.radius = radius;
    }
	
	public double areaCalculate() {
		return Math.PI * radius *radius;
	}
	
	public double circumferenceCalc() {
		return 2 * Math.PI * radius;
	}
}

public class circleTraits {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your radius: ");
		double radius = scanner.nextDouble();
		
		Circle circle=new Circle(radius);
		
		System.out.println("The area is : " + circle.areaCalculate());
		System.out.println("The circumference is: " + circle.circumferenceCalc());
		
		scanner.close();
	}
}
