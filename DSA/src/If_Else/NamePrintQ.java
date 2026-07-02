package If_Else;

import java.util.Scanner;

public class NamePrintQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 3 ==0) System.out.println("Ritika");
        else if(num % 3 == 0) System.out.println("Monika 3");
        else if(num % 5 == 0) System.out.println("Saumya 5");
        else  System.out.println("Shruti");
    }
}
