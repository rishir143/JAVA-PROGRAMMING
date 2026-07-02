package If_Else;

import java.util.Scanner;

public class Check_Is_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three side of the trinagle");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c  = sc.nextInt();
        if(a + b > c && b + c > a && c + a > b) System.out.println("This is Valid Sides, Triangle can be formed");
        else System.out.println("Triangle can not be formed");
    }

}
