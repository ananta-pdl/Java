package week6.polymorphism;


public class MethodOverloading {
    public static void addition(int a, int b) {
        System.out.println("Addition=" + (a + b));

    }
    public static void addition(int a, int b, int c) {
        System.out.println("Addition=" + (a + b + c));

    }
    static void main(String[] args) {
    addition(1,5);
    }
}