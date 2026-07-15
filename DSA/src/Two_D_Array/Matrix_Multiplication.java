package Two_D_Array;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        int[][] mat1= {{1, 2},
                       {4, 5},};

        int[][] mat2= {{3, 7},
                       {4, 1},};
        int rowA = mat1.length;;
        int colA = mat1[0].length;
        int rowB = mat2.length;
        int colB = mat2[0].length;

        int[][] result = new int[colA][rowB];

        for (int i = 0; i < colA ; i++) {

            for (int j = 0; j < rowA; j++){
                int sum = 0;
                for (int k = 0; k < colB ; k++) {
                    sum += (mat1[i][k] * mat2[k][j]);
                }
              result[i][j] = sum;
            }
            
        }
        for (int[] ele : result){
            for(int val : ele){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
