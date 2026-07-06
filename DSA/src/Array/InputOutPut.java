package Array;

import java.util.Scanner;

public class InputOutPut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
