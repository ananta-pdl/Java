package week4.Question;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing the starting balance
        double balance = 5000.0;
        boolean running = true;

        System.out.println("Welcome to the ATM System!");


        // The program runs continuously until the user exits or balance reaches zero
        while (running && balance > 0) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:
                    // Deposit Money
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Error: Deposit amount must be greater than $0.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Successfully deposited: $" + depositAmount);
                        System.out.println("New balance: $" + balance);
                    }
                    break;

                case 3:
                    // Withdraw Money
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawalAmount = scanner.nextDouble();

                    if (withdrawalAmount > balance) {
                        System.out.println("Error: Insufficient funds! Maximum withdrawal allowed is $" + balance);
                    } else if (withdrawalAmount <= 0) {
                        System.out.println("Error: Please enter a valid amount greater than $0.");
                    } else {
                        balance -= withdrawalAmount;
                        System.out.println("Withdrawal successful! Handing out: $" + withdrawalAmount);
                        System.out.println("Remaining balance: $" + balance);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;

                default:
                    // Handling invalid menu choices
                    System.out.println("Invalid choice. Please select an option between 1 and 4.");
            }


            // Auto-terminate if the balance hits exactly 0 after a transaction
            if (balance <= 0) {
                System.out.println("Your balance has reached $0. The system will now log you out automatically.");
                running = false;
            }
        }

        scanner.close();
    }
}