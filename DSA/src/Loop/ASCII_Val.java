package Loop;

import java.util.Scanner;


public class ASCII_Val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Character");
        char ch = sc.next().charAt(0);

        for(char i = 'A'; i <= 'Z'; i++){
            int n = i;
            System.out.println(n);
        }

    }
}
