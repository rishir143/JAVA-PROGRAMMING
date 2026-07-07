package Array;

import java.util.Arrays;

public class Segregate0_and_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
