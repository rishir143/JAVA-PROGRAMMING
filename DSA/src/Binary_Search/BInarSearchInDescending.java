package Binary_Search;

public class BInarSearchInDescending {
    public static void main(String[] args) {
        int[] arr = {9, 8,7, 6, 5, 4, 3, 1};

        int lo = 0;
        int tar = 3;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] < tar) hi = mid -1;
            else if (arr[mid] > tar) lo = mid + 1;
            else {
                System.out.println(mid);
                break;
            }

        }
    }
}
