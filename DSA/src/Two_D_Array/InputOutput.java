package Two_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                 arr[i][j] = sc.nextInt();
            }

        }

        for(int[] ele : arr){
            for(int val : ele){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int ele : arr[2]){
            System.out.print(ele+" ");
        }
    }
}
