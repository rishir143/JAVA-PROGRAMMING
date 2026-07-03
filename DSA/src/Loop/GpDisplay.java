package Loop;

import java.util.Scanner;

public class GpDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        for(int i = 1; i <=n; i++){
            double term = a * (Math.pow(r, i-1));
            System.out.println(term);

        }
    }
}
