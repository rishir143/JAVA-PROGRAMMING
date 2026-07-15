package Two_D_Array;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;


//
//        boolean[] rows = new boolean[n];
//        boolean[] cols = new boolean[m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == 0) {
//                    rows[i] = true;
//                    cols[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (rows[i] ||  cols[j]) {
//                 matrix[i][j] = 0;
//                }
//            }
//        }

        //OPTAMIZE TARIKA

        boolean zeroRow = false;
        boolean zeroCol = false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                zeroCol = true;
            }
        }
            for (int j = 0; j < m; j++) {
                if (matrix[0][j] == 0) {
                    zeroRow = true;
                }
            }




            for (int i = 1; i < n; i++) {

                for (int j = 1; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;

                    }
                }
            }
        if (zeroCol) {
        for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

        if (zeroRow) {
        for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }


        }


    }
