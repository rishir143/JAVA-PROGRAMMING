package Cyclic_Sort;

public class DuplicarteNum {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int rightIndx = nums[i] - 1;
            if(nums[i] == i + 1 || nums[rightIndx] == nums[i]) i++;
            else {
                swap(nums, rightIndx, i);
            }
        }
        for (int j = 0; j < n; j++) {
            if(nums[j] != j+1) return nums[j];
        }
        return -1;

    }
    public void swap(int[] arr, int indx, int i){
        int temp = arr[indx];
        arr[indx] = arr[i];
        arr[i] = temp;
    }
}
