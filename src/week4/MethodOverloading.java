package week4;

public class MethodOverloading {

    // Method with 2 parameters
    public static void add(int a, int b) {
        System.out.println("Method 1");
        System.out.println("Sum = " + (a + b));
    }

    // Overloaded method with 3 parameters
    public static void add(int a, int b, int c) {
        System.out.println("Method 2");
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {

        add(2, 3);        // calls first method
        add(1, 2, 3);     // calls second method
    }
}

//mthod over loading advantage aauta method lai different kam ko lai use garna sainxa
