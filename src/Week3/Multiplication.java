package Week3;
import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user for the input number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Step 2: Initialize the counter variable
        int i = 1;

        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("---------------------------------");

        // Step 3: Use a while loop to iterate from 1 to 10
        while (i <= 10) {
            // Step 4: Calculate the product and print the line
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

            // Step 5: Increment the counter
            i++;
        }

        System.out.println("---------------------------------");
        scanner.close();
    }
}
