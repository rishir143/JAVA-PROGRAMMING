package Pattern;

public class Rombus {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n +1; j++){
                System.out.print("*");

            }
        System.out.println();
        }
    }
}
