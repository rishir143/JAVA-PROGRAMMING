package Binary_Search;

public class KthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
int lo = 0;
int hi = arr.length - 1;
while(lo <= hi){
    int mid = (hi + lo)/2;
    int correctNum = mid + 1;
    int missingNumbers = arr[mid] - correctNum;
    if(missingNumbers >= k) hi = mid - 1;
    else lo = mid + 1;
}
return hi + 1 +k;
    }
}
