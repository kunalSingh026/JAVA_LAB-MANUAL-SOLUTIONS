import java.util.Scanner;

// 1. Create the Custom Exception Class
// It must extend the built-in 'Exception' class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Pass the message to the parent Exception class
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age to vote: ");
        int age = scanner.nextInt();

        try {
            // 2. Call the method that might throw the exception
            validateVote(age);
            System.out.println("Result: Welcome to the voting system!");
        } catch (InvalidAgeException e) {
            // 3. Catch the specific custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Process Completed.");
            scanner.close();
        }
    }

    // Method declares that it *might* throw InvalidAgeException
    public static void validateVote(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw the custom exception if condition is met
            throw new InvalidAgeException("Age must be 18 or above. You entered: " + age);
        }
    }
}