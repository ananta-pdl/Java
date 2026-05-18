package Week2;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);


        double conversionRate = 145.0;

        // asking from user for input
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();


        double inrAmount = usdAmount * conversionRate;

        // Display the result
        System.out.println(usdAmount + " USD is equal to " + inrAmount + " INR.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}