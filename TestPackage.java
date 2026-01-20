import geometry.Circle;
import java.util.Scanner;

public class TestPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the radius for the Geometry package test: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        System.out.printf("Area: %.2f%n", c.getCircumference());
        System.out.printf("Circumference: %.2f%n", c.getArea());
        sc.close();
    }
}
