package Methods;

public class SwapNum {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;}

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        System.out.println(num1 + " " + num2);
        swap(num1, num2);
        System.out.println(num1 + " " + num2);
    }
}
