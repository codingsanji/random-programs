package Java;
import java.util.*;

class Rectangle {
    double width;
    double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double rectArea() {
        return width * height;
    }
    
    public double rectPerimeter() {
        return 2 * (width + height);
    }
}

public class rectangleTraits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        
        Rectangle rect = new Rectangle(width, height);

        System.out.println("The area is: " + rect.rectArea());
        System.out.println("The perimeter is: " + rect.rectPerimeter());
        
        scanner.close();
    }
}
