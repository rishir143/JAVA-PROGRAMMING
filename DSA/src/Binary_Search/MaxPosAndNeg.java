package Binary_Search;

public class MaxPosAndNeg {
    public int maximumCount(int[] nums) {
        int n = nums.length;
     int negative = lower(nums, 0);
     int positive = n -upper(nums, 0);
return Math.max(negative, positive);
    }
    public int lower(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;

        int ans = arr.length;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] >= target){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }

        return ans;
    }

    public int upper(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;

        int ans = arr.length;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(arr[mid] > target){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }

        return ans;
    }

}
