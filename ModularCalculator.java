import java.util.*;

public class ModularCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("---- Simple Calculator ----");

        while (continueCalc) {
            System.out.println("\nSelect Operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator.Goodbye!");
                break;
            }
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please enter 1-5.");
            }
        }
        sc.close();
    }

    public static void add(double a, double b) {
        System.out.println("Result: " + (a + b));
    }
    public static void subtract(double a, double b) {
        System.out.println("Result: " + (a - b));
    }
    public static void multiply(double a, double b) {
        System.out.println("Result: " + (a * b));
    }
    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.printf("Result: %.2f%n", (a / b));
        }
    }
}
