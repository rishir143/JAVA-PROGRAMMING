package Pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 4;
       int count = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
