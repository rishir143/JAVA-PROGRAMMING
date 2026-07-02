package If_Else;

import java.util.Scanner;

public class CheckInterger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if(num == (int)num) System.out.println("It is integer");
        else System.out.println("The number is not Integer");
    }
}
