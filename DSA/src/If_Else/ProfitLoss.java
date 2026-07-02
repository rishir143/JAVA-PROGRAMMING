package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling Price");
        double sp = sc.nextDouble();
        System.out.println("Enter the Cost Price");
        double cp = sc.nextDouble();
        if(sp < 0 || cp < 0) System.out.println("The Enter Amount is Wrong, Money can be negative");
        else if(sp > cp) System.out.println("The Profit is " + (sp-cp));
        else System.out.println("The Loss is " + (cp -sp));
    }
}
