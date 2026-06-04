package week4;

public class Ecommerce {
    public static void calculatePrice(double[] prices){
        double totalPrice = 0;
        for(double price: prices){
            totalPrice += price;
        }

        double finalPrice = 0;

        if (totalPrice > 1000){ // discount 20%
            finalPrice = totalPrice - (totalPrice * 20 / 100);
        } else if (totalPrice <= 1000 && totalPrice > 600) { // discount 10%
            finalPrice = totalPrice - (totalPrice * 10 / 100); // Fixed: Added the 10% discount logic
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("Final price: " + finalPrice);
    }

    // Fixed: Added 'public' so the JVM can actually run the program
    public static void main(String[] args){
        double[] prices = {2000};
        calculatePrice(prices);
    }
}