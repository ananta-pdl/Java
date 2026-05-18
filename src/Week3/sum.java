package Week3;

public class sum {
    public static void main(String[] args) {
        int sum=0;
        int[] numbers={1,2,3,8};
        for (int val:numbers){
            sum+=val;
        }
        System.out.println(sum);
    }
}
