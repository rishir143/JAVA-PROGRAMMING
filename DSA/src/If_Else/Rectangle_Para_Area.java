package If_Else;

import java.util.Scanner;

public class Rectangle_Para_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle");
        double len = sc.nextDouble();
        System.out.println("Enter the Breadth of the Rectangle");
        double bread = sc.nextDouble();
        double area = len * bread;
        double para = 2 * (len + bread);

        if(len < 0 || bread < 0) System.out.println("The length or breadth can be negative value");
        else if(area > para) System.out.printf("The Area %.2f is greater than Parameter %.2f. %n", area, para);
        else {
            System.out.printf("The Para %.2f is greater than area %.2f. %n ", para, area);
        }

    }
}
