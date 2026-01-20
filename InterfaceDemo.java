import java.util.*;
interface Shape {
    double perimeter();
    double area();
}

class Circle implements Shape {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    public double area() {
        return length * width;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        double r = sc.nextDouble();

        Shape circle = new Circle(r);

        System.out.printf("Circle Area: %.2f%n", circle.area());
        System.out.printf("Circle Perimeter: %.2f%n", circle.perimeter());
        System.out.println("---------------------------");

        // Test Rectangle
        System.out.print("Enter length and width of the Rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        
        // Polymorphism: Shape reference pointing to Rectangle object
        Shape myRect = new Rectangle(l, w);
        
        System.out.printf("Rectangle Area: %.2f%n", myRect.area());
        System.out.printf("Rectangle Perimeter: %.2f%n", myRect.perimeter());
        sc.close();
    }
}
