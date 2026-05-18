package week2;
import java.util.Scanner;
//
//public class UserInputExample {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter name of your user::");
//        int userInput=sc.nextInt();
//
//    }
//}
//var=int(enter('Enter your namae:'))


class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter currency in USD:");
        double usercurrency = sc.nextDouble();

        double npr = usercurrency * 145;

        System.out.println("The value in NPR is: " + npr);

    }
}




class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate (R): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (T in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);

        sc.close();
    }
}



