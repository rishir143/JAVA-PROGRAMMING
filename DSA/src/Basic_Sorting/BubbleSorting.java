package Basic_Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7,4,2,0};
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1 - i ; j++) {
                if(arr[j] < arr[j + 1]) {  // descending Order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
