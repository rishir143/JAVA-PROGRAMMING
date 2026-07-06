package Array;

import java.util.Arrays;

public class Array_Pass_Method {
    public static void change(int[] arr){
        arr[2] =45;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6 , 8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
