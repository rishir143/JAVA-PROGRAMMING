package Binary_Search;

public class LastOccurance {
    public int firstSearch(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int tar = 3;
        int indx = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > tar) hi = mid - 1;
            else if (arr[mid] < tar) lo = mid + 1;
             else{
                 indx = mid;
                 lo = mid + 1;
            }
        }
        return indx;
    }
}