package week4;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static double addition(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        double a =sc.nextDouble();
        System.out.println("enter a number another");
        double b=sc.nextDouble();
        double c=a+b;
        return c;

    }
    public static double subtraction(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        double a =sc.nextDouble();
        System.out.println("enter a number another");
        double b=sc.nextDouble();
        double c=a-b;
        return c;
    }
    public static double multiply(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        double a =sc.nextDouble();
        System.out.println("enter a number another");
        double b=sc.nextDouble();
        double c=a*b;
        return c;

    }
    public static double division(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        double a =sc.nextDouble();
        System.out.println("enter a number another");
        double b=sc.nextDouble();
        double c=a/b;
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;
        while (!isEnd) {
            System.out.println("choose an option");
            System.out.println("1 addition");
            System.out.println("2 subtraction");
            System.out.println("3 multiply");
            System.out.println("4 divide");
            System.out.println("5 end");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    //double sum=addition();
                    System.out.println("the sum is"+ addition());
                }
                case 2 ->{
                    System.out.println("the sub is"+ subtraction());
                }
                case 3 ->{
                    System.out.println("the sub is"+ multiply());
                }
                case 4 ->{
                    System.out.println("the sub is"+ division());
                }
                case 5 ->{
                    isEnd=true;
                    System.out.println("ending");
                }
                default ->{
                    System.out.println("not available");
                }

            }
        }
    }
}