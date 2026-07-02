package If_Else;

import java.util.Scanner;

public class CheckIs69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextDouble();
        if(num < 69 && num > -69) System.out.println("The Magnitude of the Number is smalller than 69");
        else  System.out.println("The Magnitude of the Number is greater than 69");
    }
}
