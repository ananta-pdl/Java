package Week2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a grade
        System.out.print("Enter the student's grade (0-100): ");
        int score = scanner.nextInt();

        // Check the conditions using an if-else if-else chain
        if (score >= 90 && score <= 100) {
            System.out.println("Letter Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Letter Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Letter Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Letter Grade: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Letter Grade: F");
        } else {

            System.out.println("Invalid score! Please enter a number between 0 and 100.");
        }

        // Close the scanner resource
        scanner.close();
    }
}