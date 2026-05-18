package week2;

import java.util.Scanner;

public class LoginAUthentication {
    public static void main(String[] args) {
        String validUsername = "milan";
        String validPassword = "milandada456";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name::");
        String username=sc.next();
        System.out.println("Enter user name::");
        String password=sc.next();

        if (username.equals(validUsername) && validPassword.equals(password)) {
            System.out.println("Congo, get in::");
        } else if (username.equals(validUsername)&& ! password.equals(validPassword)) {
            System.out.println("incorrect password:::");

        }
    }
}
