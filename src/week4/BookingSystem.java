package week4;

import java.util.Objects;
import java.util.Scanner;

public class BookingSystem {
    // Available dates to pick from
    static String[] reservationarr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};
    // Dates that have already been taken
    static String[] bookedarr = {"2025-01-21", "2025-01-23"};

    public static void CheckAvailability() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter reservation date (yyyy-mm-dd): ");
        String userBookingDate = sc.next();

        boolean isAnAvailableDate = false;
        boolean isAlreadyBooked = false;

        // Step 1: Check if the date even exists in our system
        for (String val : reservationarr) {
            if (val.equals(userBookingDate)) {
                isAnAvailableDate = true;
                break;
            }
        }

        // Step 2: Check if someone has already taken it
        for (String val : bookedarr) {
            if (val.equals(userBookingDate)) {
                isAlreadyBooked = true;
                break;
            }
        }

        // Step 3: Evaluate
        if (!isAnAvailableDate) {
            System.out.println("Error: That date is not available for reservation.");
        } else if (isAlreadyBooked) {
            System.out.println("Sorry, that date is already booked.");
        } else {
            System.out.println("Successfully booked!");
        }
    }

    // Changed to return boolean so main knows if login succeeded
    public static boolean authenticate() {
        String password = "milandada";
        int attempts = 0;
        Scanner sc = new Scanner(System.in); // Put scanner outside the loop

        while (attempts < 3) { // Fixed: Changed <= to < for exactly 3 attempts
            System.out.print("Enter your password: ");
            String userPassword = sc.next();

            if (Objects.equals(userPassword, password)) {
                System.out.println("Congrats, you are in!");
                return true; // Login successful
            } else {
                attempts += 1;
                System.out.println("Wrong. " + (3 - attempts) + " attempt(s) left.");
            }
        }

        System.out.println("You are locked out!");
        return false; // Login failed
    }

    public static void main(String[] args) {
        // Only check availability if authentication returns true
        if (authenticate()) {
            CheckAvailability();
        }
    }
}