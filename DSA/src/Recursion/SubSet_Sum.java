package Recursion;

public class SubSet_Sum {
    static boolean isSubsetSum(int arr[], int sum) {
return subsetHelper(arr, sum, 0);
    }
    public static boolean subsetHelper(int[] arr, int sum, int indx){
        if(sum == 0){
            return true;
        }
        if(indx == arr.length) return false;

        if(arr[indx] > sum ) return subsetHelper(arr, sum, indx + 1);

       boolean pick = subsetHelper(arr, sum - arr[indx], indx + 1); //pick

        if(pick) return true;
        boolean skip = subsetHelper(arr, sum, indx + 1);

        return skip;

    }

}




