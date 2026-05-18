package Week1;
//this code shows the demonstration of typecasting in java
public class TypeCastingExample {
    public static void main(String[] args) {
        int price=200;
        double newPrice=price; //implicit or widening type casting
        System.out.println(price);
        System.out.println(newPrice);

        double ClothPrice = 1520;
        int NewClothPrice= (int) ClothPrice; //this is explicit typecasting
        System.out.println(ClothPrice);
        System.out.println(NewClothPrice);

        int num1 = 88;
        int num2 = 289;

        double result = (double) num2 / num1;
        System.out.println("result=" + result);
    }
}