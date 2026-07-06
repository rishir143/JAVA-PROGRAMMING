package Array;

import java.util.Scanner;

public class Min_Val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if(min > arr[i]) min = arr[i];
        }
        System.out.println(min);

    }
}
