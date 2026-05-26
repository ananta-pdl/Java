package Week5.accessModifier;


//access modifier vanako chai code ma tyo class method kati scope samma user garna payo
//public----tyo class chai jun package bata pani access garna milxa
//protected ---- can only access on same package class, but can also access by other package class
//with the help of inheritance, see protected* class in package constructor
//defalut ---same package ko class haru ma matra access garna milxa
//privete-- same class ma matra access garna milxa


public class AccessModifier {
    public static void main(String[] args) {
        Protected protected_examole= new  Protected();
        protected_examole.printdetails();
        protected_examole.run();
    }
}
