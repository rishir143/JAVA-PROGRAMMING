package Methods;

public class Permutation_COmb {
    private static int fact(int n){
        if(n < 1) return 1;
        return n * fact(n-1);
    }

    public static int ncr(int n, int r){
        if(n == r || n == 0 || r == 0) return 1;
        int result = fact(n)/(fact(r)* fact(n-r));
        return result;
    }

    public static int npr(int n, int r){
        if(n == r || n == 0 || r == 0) return 1;
        int result = fact(n)/ fact(n-r);
        return result;
    }

    public static void main(String[] args) {
        System.out.println( ncr(1, 1));
        System.out.println( npr(4, 2));


    }
}
