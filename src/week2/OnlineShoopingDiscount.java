package week2;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class OnlineShoopingDiscount {
    public static void main(String[] args) {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put()
        int counter=0;
        while (counter<10) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Amount: ");
            double amount = sc.nextDouble();
            double discount = 0;
            if (amount <= 200) {
                double FinalAmount = amount - discount;
                System.out.println("your final amount is" + FinalAmount + " " + "no discount is applied");


            } else if (amount > 200 && amount < 500) {
                discount = 0.1 * amount;
                double FinalAmount = amount - discount;
                System.out.println("your final amount is" + FinalAmount + "10 % discount is applied");

            } else {
                discount = 0.2 * amount;
                double FinalAmount = amount - discount;
                System.out.println("your final amount is" + FinalAmount + " " + "20 % discount is applied which is " + " " + discount);

            }
            counter+=1;
        }
    }

}

//a=int(input('Enter a number::'))
