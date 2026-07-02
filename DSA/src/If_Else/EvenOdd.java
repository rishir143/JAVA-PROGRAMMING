package If_Else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) System.out.printf("the num %d is even number. %n", num);
        else System.out.printf("the num %d is Odd number. %n ", num);
    }
}
