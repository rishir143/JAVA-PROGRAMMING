package Cyclic_Sort;



public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int rightIndx = nums[i] - 1;

            if (nums[i] == i + 1 || nums[i] == nums[rightIndx]) i++;
            else {
                swap(nums, i, rightIndx);
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};

            }
        }
        return new int[]{-1, -1};
    }


    public void swap(int[] arr, int indx, int i) {
        int temp = arr[indx];
        arr[indx] = arr[i];
        arr[i] = temp;
    }
}

