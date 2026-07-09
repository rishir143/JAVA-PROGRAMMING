package Two_D_Array;

public class Transpose_Matrix {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] nums = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[j][i] = matrix[i][j];
            }
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
