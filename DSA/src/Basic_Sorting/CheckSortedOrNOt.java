package Basic_Sorting;

public class CheckSortedOrNOt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 5, 6, 9};
            int flag =0;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag == 1) System.out.println("Array not sorted");
        else System.out.println("Array is Sorted");
    }
}
