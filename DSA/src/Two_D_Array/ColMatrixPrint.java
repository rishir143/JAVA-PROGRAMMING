package Two_D_Array;

public class ColMatrixPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3 },
                {4, 5, 6},
                {7, 8, 9},
        };
//        int i = 0;
//        int k =0;
//        while(k < arr[0].length){
//            i=0;
//            while(arr.length > i){
//                System.out.print(arr[i][k] + " ");
//                i++;
//            }
//            System.out.println();
//            k++;
//        }

//        Method-2
        for (int k = 0; k < arr[0].length; k++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}
