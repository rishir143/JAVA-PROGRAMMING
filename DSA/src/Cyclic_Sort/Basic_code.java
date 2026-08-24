package Cyclic_Sort;

public class Basic_code {
    public static void swap(int[] arr, int indx, int i){
        int temp = arr[indx];
        arr[indx] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
      int[] arr = {0, 3, 2, 5, 1, 4, 7, 6};
      int n = arr.length;

        int i = 0;

        while(i < n){
            if(arr[i] == i) i++;
            else {

                int indx = arr[i];
                swap(arr, indx, i);

            }
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
