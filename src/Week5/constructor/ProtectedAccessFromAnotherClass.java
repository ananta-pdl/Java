package Week5.constructor;

import Week5.accessModifier.Protected;

public class ProtectedAccessFromAnotherClass extends Protected {
    public static void main(String[] args) {
        Protected without_inheritance=new Protected();
        ProtectedAccessFromAnotherClass with_inheritance=new ProtectedAccessFromAnotherClass();
        with_inheritance.printdetails();

    }
}
