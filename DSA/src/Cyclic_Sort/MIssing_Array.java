package Cyclic_Sort;

public class MIssing_Array {
    public int missingNumber(int[] arr) {
     int n = arr.length + 1;
     long sum = (n * (n - 1))/2;
     int  arrSum = 0;
     for(int ele : arr){
         arrSum += ele;
     }

     return (int)(sum - arrSum);
    }
}
