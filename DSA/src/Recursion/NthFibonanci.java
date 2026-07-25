package Recursion;

public class NthFibonanci {
    public static int fact(int n ){
        if(n <= 1) return n;
        return  n * fact(n - 1);
    }

    public static void main(String[] args) {
       int res = fact(3);
        System.out.println(res);
    }
}
