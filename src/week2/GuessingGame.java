package week2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        int guess = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Check if input is valid
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Please enter a valid number!");
                scanner.next(); // clear invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("📉 Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("📈 Too high!");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}