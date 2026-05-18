package week4;

public class MethodExampl {

    public static void addition(int a, int b) {
        System.out.println("addition" + " " + (a+b));
    }

    public void multiplication() {
        System.out.println("multiplication");
    }

    public static void main(String[] args) {

        addition(2,4); // static method

        MethodExampl obj = new MethodExampl(); // create object
        obj.multiplication(); // call non-static method
    }
}