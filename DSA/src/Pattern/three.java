package Pattern;

public class three {
    public static void main(String[] args) {
//        A B C D
//        A B C D
//        A B C D
//        A B C D
        char row = 'D';
        char col = 'D';
//        for(char i = 1; i <= row; i++){
//            for(char j = 'A'; j <= col; j++){
//                System.out.print(j + " " );
//            }
//            System.out.println();
//        }

        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+96) + " " );
            }
            System.out.println();
        }
    }
}
