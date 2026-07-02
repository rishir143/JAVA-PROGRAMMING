package If_Else;

import java.util.Scanner;

public class LiesInQudrantQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        double x = sc.nextDouble();
        System.out.println("Enter the y coordinate");
        double y = sc.nextDouble();
        if(x > 0 && y > 0) System.out.printf("The points (%.2f, %.2f) lies in 1st Qudrant", x, y);
       else if(x < 0 && y > 0) System.out.printf("The points (%.2f, %.2f ) lies in 2th Qudrant", x, y);
       else if(x < 0 && y < 0) System.out.printf("The points (%.2f, %.2f) lies in 3th Qudrant", x, y);
       else System.out.printf("The points (%.2f, %.2f) lies in 4th Qudrant", x, y);
    }
}
