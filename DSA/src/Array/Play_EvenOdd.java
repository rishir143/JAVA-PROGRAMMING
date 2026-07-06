package Array;

import java.util.Arrays;

public class Play_EvenOdd {
    public static void EvenOdd(int[] arr){
        for(int i = 0; i< arr.length; i++){
            if(i % 2 == 0){
                arr[i] += arr[i] * 2;
            }
            else  arr[i] += 10;
        }
    }
    public static void main(String[] args) {
        int[] arr ={ 2, 6 , 8, 9, 0, 89, 98};
        EvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
