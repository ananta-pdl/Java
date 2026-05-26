package week4;

public class Recursion {
    public static int calcFactorial(int n){
        if (n>=1){
            return n * calcFactorial(n-1);
        }
        else{
            return 1;
        }
    }

    // 4 = 4+3+2+1 =10
    public static int calcSum(int n){
        if (n>1){
            return n + calcSum(n-1);
        }
        else {
            return 1;
        }
    }
    static void main(String[] args) {
        int fact = calcFactorial(5);
        int sum=calcSum(5);
        System.out.println("sum = " + sum);
        System.out.println("factorial = " + fact);

    }
}