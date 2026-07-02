package If_Else;

import java.util.Scanner;

public class AbsoluteVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            n = -n;
            System.out.println("The absolute value of number "  + n);
        }
        else System.out.println("the absolute val is " + n);

    }
}
