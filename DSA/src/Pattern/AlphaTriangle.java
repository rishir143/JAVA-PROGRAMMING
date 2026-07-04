package Pattern;

public class AlphaTriangle {
    public static void main(String[] args) {
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print((char)(j + 65) + " ");
            }
            System.out.println();
        }
    }
}
