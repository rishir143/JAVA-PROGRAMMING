package Array;

public class PrintNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 8, -34, -5, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) System.out.println(arr[i]);
        }
    }
}
