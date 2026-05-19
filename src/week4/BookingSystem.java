package week4;
import java.util.Objects;
import java.util.Scanner;
public class BookingSystem {
    static String [] reservationarr={"2025-01-21","2025-01-23","2025-01-24","2025-01-29"};
    static String [] bookedarr={"2025-01-21","2025-01-23"};
    public  static  void CheckAvailability(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reservation date (yyyy-mm-dd): ");
        String userBookingDate = sc.next();
        int flag=0;
        for (String val:reservationarr){
            if (val.equals(userBookingDate)){
               flag+=1;
            }
        }
        for (String val : bookedarr){
            if (val.equals(userBookingDate)){
                flag+=1;
            }
        }
        if (flag==2){
            System.out.println("already booked");
        }
        else {
            System.out.println("successfully booked");
        }
    }

    public static void authenticate() {
        String password= "milandada";
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



    public static void main(String[] args) {
        authenticate();
        CheckAvailability();
    }

}
//hi
