package Two_D_Array;

import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }

        }
        int sum =0;
        for(int[] ele : arr){
            for(int val : ele) {
                sum += val;
            }
        }
        System.out.println(sum);

    }
}
