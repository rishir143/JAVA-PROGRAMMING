package Pattern;

public class Num_Alpha_Triangle {
//    1
//    A B
//    1 2 3
//    A B C D
//    1 2 3 4 5

    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                if(i % 2 == 0) System.out.print(j+1 + " ");
                else System.out.print((char)(j + 65) + " ");
            }
            System.out.println();
        }
    }
}
