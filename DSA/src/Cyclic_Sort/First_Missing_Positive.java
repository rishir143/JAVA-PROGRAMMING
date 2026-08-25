package Cyclic_Sort;

public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int rightIndx = nums[i] - 1;

            if (nums[i] <= 0) i++;
            else if(nums[i] > n) i++;
            else if(nums[i] == i + 1) i++;
            else if(nums[i] ==  nums[nums[i] - 1]) i++;
            else swap(nums, i, rightIndx);

        }

        for (int j = 0; j < n ; j++) {
            if(nums[j] != j + 1) return j + 1;
        }
        return n + 1;
    }
    public void swap(int[] arr, int indx, int i) {
        int temp = arr[indx];
        arr[indx] = arr[i];
        arr[i] = temp;
    }
    }


