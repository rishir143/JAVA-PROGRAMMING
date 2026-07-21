package Binary_Search;

public class FloorInSortedArr {
    int findFloor(int arr[],  int tar) {
int lo = 0;
int hi = arr.length - 1;
 int indx = -1;
while(lo <= hi){
    int mid = lo + (hi - lo)/2;
    if(arr[mid] > tar) hi = mid -2;
    else {
        indx = mid;
        lo = mid + 1;
    }
}
return indx;
    }
}
