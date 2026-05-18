package week1;
public class VariableExample {
    public static void main(String[] args) {

        // --- 1. Primitive Data Types ---
        // These store simple values and have fixed sizes in memory.

        byte smallNumber = 5;          // 8-bit: -128 to 127
        short mediumNumber = 2;        // 16-bit: -32,768 to 32,767
        int standardNumber = 190;      // 32-bit: The most common type for integers
        long largeNumber = 123454L;  // 64-bit: Used for very large values (note the 'L')

        float decimalRate = 9.66f;    // 32-bit: Floating point (note the 'f')
        double productPrice = 3.56;   // 64-bit: More precise decimal values

        char initialLetter = 'A';      // Stores a single character
        boolean isJavaFun = true;      // Stores true or false (missing from your original!)

        // --- 2. Non-Primitive (Reference) Data Types ---
        // These are objects; they are customizable and include built-in functions.

        String userName = "Milan";

        // Example of a function (method) available to non-primitives:
        System.out.println("The length of the name is: " + userName.length());

        // Summary Output
        System.out.println("Price: $" + productPrice);
        System.out.println("Grade: " + initialLetter);
    }
}

