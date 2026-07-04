package Pattern;

public class ApTriangle {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;
        int a = 1;
        int d = 2;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                int term = a + (j)*d;
                System.out.print(term +" ");
            }
            System.out.println();
        }
    }
}
