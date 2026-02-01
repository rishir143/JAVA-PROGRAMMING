import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.println("enter the temperature in celsius");
        Scanner in = new Scanner(System.in);
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Farenhite is " + tempF);
                }
    }

