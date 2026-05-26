package week4;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Continuous Calculator ===");

        while (running) {
            // Display Menu
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

                int choice = input.nextInt();

            // Check if the user wants to exit right away
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                break;
            }

            // If they didn't pick 1-5, restart the loop
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please pick a number between 1 and 5.");
                continue;
            }

            // Get the numbers for the calculation
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case 4:
                    double divResult = divide(num1, num2);
                    if (Double.isNaN(divResult)) {
                        System.out.println("Error! Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + divResult);
                    }
                    break;
            }
        }

        input.close();
    }

    // Math Methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }
}