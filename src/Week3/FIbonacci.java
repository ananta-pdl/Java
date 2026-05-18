package Week3;
import java.util.Scanner;
public class FIbonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number::");
        int num=sc.nextInt();
        int count=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while((num-2)>=count){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
            count+=1;
        }

    }
}
