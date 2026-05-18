package Week2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Time period in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest per year (R%): ");
        double rate = scanner.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;


        System.out.println("--- Calculation Summary ---");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Time Period     : " + time + " years");
        System.out.println("Interest Rate   : " + rate + "%");
        System.out.println("Simple Interest : " + simpleInterest);

        // Close the scanner resource
        scanner.close();
    }
}