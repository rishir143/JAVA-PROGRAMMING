package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
//        int[] arr = {3, 5, 8, 9, 5};
//        int n = arr.length - 1;
//        for (int i = 0; i < arr.length; i++){
//            int temp = arr[i];
//            arr[i] = arr[n- i];
//            arr[n - i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr = {3, 5, 8, 9, 5};
       int j = arr.length - 1;
       int i = 0;

       while (j>i){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(arr));
    }
}
