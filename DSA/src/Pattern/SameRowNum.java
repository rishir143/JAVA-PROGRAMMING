package Pattern;

public class SameRowNum {
    public static void main(String[] args) {
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
        int row = 4;
        int col = 4;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
