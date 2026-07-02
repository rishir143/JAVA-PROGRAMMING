package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius Of the Circle");
        double rad = sc.nextDouble();
        if (rad > 0) {
            double area = 3.14159 * rad * rad;
            System.out.println("The area of the circle is " + area);

        } else {
            System.out.println("Invalid Radius");
        }
    }
}
