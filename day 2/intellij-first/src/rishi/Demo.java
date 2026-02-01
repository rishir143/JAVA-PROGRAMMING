package rishi;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.nextLine());
        input.next();

    }
}
