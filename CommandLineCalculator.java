public class CommandLineCalculator {

    public static void main(String[] args) {
        // 1. Validate Input Length
        // We expect exactly 3 arguments: Number1, Operator, Number2
        if (args.length != 3) {
            System.out.println("Error: Please provide exactly 3 arguments.");
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            System.out.println("Example: java CommandLineCalculator 10 + 5");
            return; // Exit program
        }

        try {
            // 2. Parse Arguments
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            // 3. Perform Operation
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*": 
                case "x": // Alternate multiplication symbol
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operator. Use +, -, *, or /");
                    return;
            }

            // 4. Display Output
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Arguments must be valid numbers.");
        }
    }
}