package Week3;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] values = {{1, 2, 3}, {8, 9, 7}};
        for (int[] arr : values) {
            for (int val : arr) {
                System.out.print(val);
            }
            System.out.println(" ");
        }
    }
}