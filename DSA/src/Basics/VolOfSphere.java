package Basics;

import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double vol = 4/3 * 3.14159 * Math.pow(rad, 3);
        System.out.println("The Volumne of the Square is" +vol);
    }
}
