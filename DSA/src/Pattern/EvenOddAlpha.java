package Pattern;

public class EvenOddAlpha {
    public static void main(String[] args) {
//        a a a a
//        B B B B
//        c c c c
//        D D D D

        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i % 2 == 0) System.out.print((char)(j+64) + " ");
                else System.out.print((char)(j+96) + " " );
            }
            System.out.println();
        }
    }
}
