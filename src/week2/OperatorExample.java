package week2;

public class OperatorExample{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 0 && b > 0) = " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b < 0) = " + (a > 0 || b < 0));
        System.out.println("!(a > b) = " + !(a > b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        c += b;
        System.out.println("c += b : " + c);

        // Increment and Decrement Operators
        System.out.println("\nIncrement/Decrement Operators:");
        a++;
        b--;
        System.out.println("a++ = " + a);
        System.out.println("b-- = " + b);
    }
}
