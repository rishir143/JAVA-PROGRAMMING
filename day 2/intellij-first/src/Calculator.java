import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true){
            System.out.println("Enter the operation You want Perform");
            int ops = in.next().trim().charAt(0);

            int ans = 0;
            if(ops == '+' || ops == '-' || ops == '*'|| ops == '/' || ops =='%'){

                System.out.println("enter the value of num1 and num2");
                int a = in.nextInt();
                int b = in.nextInt();

                if(ops == '+') {
                    ans = a + b;
                }
                if(ops == '-') {
                    ans = a - b;
                }
                if(ops == '*') {
                    ans = a * b;
                }
                if(ops == '/') {
                    ans = a / b;
                }
                if(ops == '%') {
                    ans = a % b;
                }

            }
            else if(ops == 'x' || ops == 'X'){
                break;
            }
            else{
                System.out.println("invalid Syntx");
            }
            System.out.println(ans);

        }

        }
    }

