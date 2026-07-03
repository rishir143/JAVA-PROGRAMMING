package Loop;

import java.util.Scanner;

public class PrintPositiveSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int a = 99;
        int d = -4;
        for(int i = 1; i <= n; i++){
            int term = a + (i - 1)*d;
            if(term < 0) break;
            System.out.print(term + " ");
        }
    }
}
