package If_Else;

import java.util.Scanner;

public class Four_Digit_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextDouble();
        if(num >999 && num < 10000) System.out.println("Given number is 4 Digit number");
        else System.out.println("The Number is not digit number");

    }
}
