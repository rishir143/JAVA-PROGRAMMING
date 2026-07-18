package Basic_Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7,4,2,0};
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int min = Integer.MAX_VALUE; int minIndx = -1;
            for (int j = i; j < n ; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    minIndx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
            
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
