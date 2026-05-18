package Week3;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};
        int max=numbers[0];
        int min=numbers[0];

        for (int val:numbers){
            if (val>max){
                max=val;
            }

            if (val<min){
                min=val;
            }
        }
        System.out.println( max);
        }
    }
