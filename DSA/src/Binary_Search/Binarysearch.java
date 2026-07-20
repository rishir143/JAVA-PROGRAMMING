package Binary_Search;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,6,7,8,9};
        int n = arr.length - 1;
        int lo = 0;
        int hi = n - 1;
        int target = 8;
        for (int i = 0; i < n; i++) {
            int mid = hi - (hi + lo)/2;
            if(arr[i] == target){
                System.out.println(i + 1);
                break;
            } else if (arr[i] > target) {
                hi = mid -1;

            }
            else lo = mid + 1;
        }
    }
}
