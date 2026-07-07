package Two_D_Array;

import java.util.Scanner;

public class Row_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }

        }
        int sum =0;
        int maxSum = 0;
        int maxRow = -1;
        for(int i = 0; i < arr.length; i++){
            sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("row is " + (maxRow + 1));
    }
}
