package Recursion;

public class DecAndIncreasing {
    public static void display(int n){
        if(n == 0) return;
        System.out.println(n);
        display(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        display(5);
    }
}
