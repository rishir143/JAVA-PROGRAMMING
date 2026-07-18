package Basic_Sorting;

public class MoveZeroToEnd {
    public void moveZeroes(int[] nums) {
        int[] arr = {1, 0, 6, 0, 4, 0, 8};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i ; j++) {
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
