package Loop;

import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of AP");
        int n = sc.nextInt();
        int a = 2;
        int d = 3;
        for(int i = 1; i <= n; i++){
            int term = a + (i - 1)*d;
            System.out.print(term + " ");
        }

    }
}
