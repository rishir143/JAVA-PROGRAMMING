package Pattern;

public class AlphaRightTriangle {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = 0; j < n; j++){
                if(i+j >= n -1) System.out.print(count++);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
