package Recursion;

public class BS_Recursion {

    public static int helper(int[] arr, int target, int lo, int hi){
        if(lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return helper(arr, target, lo, mid - 1);
        else return helper(arr, target, mid + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 5;
        int n = arr.length;
        System.out.println(helper(arr, target, 0, n -1));
    }
}
