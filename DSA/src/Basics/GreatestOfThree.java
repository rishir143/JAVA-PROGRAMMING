package Basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();
        System.out.println("Enter the c");
        int c = sc.nextInt();

        if(a > b && a > c) System.out.println("the Number 'a' is greatest " + a);
        else if(b > a && b > c) System.out.println("the Number 'b' is greatest " + b);
        else System.out.println("'c' is the greatest " + c);
    }
}
