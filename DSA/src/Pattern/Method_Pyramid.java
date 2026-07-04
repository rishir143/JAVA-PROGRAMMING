package Pattern;

public class Method_Pyramid {
    //nst = no of star
    //nsp = no of space
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n - 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++) System.out.print("  ");
            for( int j = 1; j <= nst; j++) System.out.print("* ");
            nsp--;
            nst += 2;
            System.out.println();

        }


    }
}
