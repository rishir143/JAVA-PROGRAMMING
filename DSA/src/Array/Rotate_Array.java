package Array;

import java.util.Arrays;

public class Rotate_Array {
    public static void swap(int[] arr, int i, int j){
        while(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length -1;
        int k = 3;
        int i = 0;
        swap(arr, 0, n);
      swap(arr, 0, k-1);
      swap(arr, k, n);

        System.out.println(Arrays.toString(arr));
    }
}
