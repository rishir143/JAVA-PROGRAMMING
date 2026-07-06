package Methods;

import java.util.Scanner;

public class ReturnIsMandatory {
    private static double guess(int num){
        if(num < 10) return (10 * Math.random());
        else  return (100* Math.random());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(guess(a));
    }
}
