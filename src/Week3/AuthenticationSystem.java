package Week3;
import java.util.Objects;
import java.util.Scanner;
public class AuthenticationSystem {
    public static void main(String[] args) {
        String password="milandada";
        int attempts=0;
        while (attempts<=3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password::");
            String userPassword = sc.next();

            if (Objects.equals(userPassword, password)){
                System.out.println("congo, you are in::");
                break;
            } else {
                System.out.println("Wrong, " + (3-attempts) + " " +"attempt left");

            }
            attempts+=1;
        }
        if (attempts>3){
            System.out.println("you are locked");
        }
        }

    }

