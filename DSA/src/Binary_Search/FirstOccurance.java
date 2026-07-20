package Binary_Search;

public class FirstOccurance {
    public int firstSearch(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int indx = -1;
        int target = 8;
        while(lo <=hi){
            int mid = hi - (hi + lo)/2;
            if(arr[mid] == target){
                indx = mid;
                hi = mid - 1;
            } else if (arr[mid] > target) {
                hi = mid -1;

            }
            else lo = mid + 1;
        }
    return indx;

    }

}
