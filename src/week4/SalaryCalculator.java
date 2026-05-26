package week4;

import java.util.Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    // Global variables accessible by all methods
    static int month_salary = 50000;
    static int base_hours = 230;
    static int hourly_bonus = 230;

    // NEW METHOD: Dedicated strictly to calculating extra pay
    public static int calculateOvertime(int working_hrs) {
        int overtime_hrs = working_hrs - base_hours;
        return overtime_hrs * hourly_bonus;
    }

    public static void CalculateSalary(int working_hrs) {

        if (working_hrs < base_hours) {
            int less_worked_hrs=base_hours-working_hrs;
            int hourly_rate=month_salary/base_hours;
            int final_salary=month_salary-(less_worked_hrs*hourly_rate);

            System.out.println("You earn " + final_salary + " but make sure you work for base hrs!");

        } else if (working_hrs == base_hours) {
            System.out.println("You earn $" + month_salary + " monthly.");

        } else {
            // Call the overtime method to fetch the bonus amount
            int total_bonus = calculateOvertime(working_hrs);
            int total_salary = month_salary + total_bonus;
            int overtime_hrs = working_hrs - base_hours;

            System.out.println("--- Overtime Summary ---");
            System.out.println("Base Salary:     $" + month_salary);
            System.out.println("Overtime Hours:  " + overtime_hrs + " hrs");
            System.out.println("Overtime Bonus:  $" + total_bonus);
            System.out.println("Total Earnings:  $" + total_salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter work hours per month: ");
        int working_hrs = sc.nextInt();

        CalculateSalary(working_hrs);

        sc.close();
    }
}