package Basic_Sorting;

import java.util.Arrays;

public class KthSmallestEle {
    public static void main(String[] args) {
        int[] arr = {4, 4,2,6,87,9,1,7,1,};
        int k = 3;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minIndx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    minIndx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[k -1]);
    }
}
