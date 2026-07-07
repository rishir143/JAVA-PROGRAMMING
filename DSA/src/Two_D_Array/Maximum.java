package Two_D_Array;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }

        }
        int max =0;
        for(int[] ele : arr){
            for(int val : ele) {
                if(val > max) max = val;
            }
        }
        System.out.println(max);
    }
}
