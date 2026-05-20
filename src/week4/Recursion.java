package week4;

public class Recursion {

    public static int calcFact(int n){
        if (n>1){
            return n*calcFact(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int fact=calcFact(5);
        System.out.println(fact);
    }
}
