package Array;

import java.util.Scanner;

public class Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
           if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);

    }
}
