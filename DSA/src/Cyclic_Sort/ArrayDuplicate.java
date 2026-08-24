package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < n){
            int rightIndx = nums[i] - 1;

            if(nums[i] == i + 1 || nums[i] == nums[rightIndx]) i++;
            else{

                swap(nums, i, rightIndx);
            }
        }

        for(int j = 0; j < n; j++){
            if(nums[j] != j+1) list.add(nums[j]);

        }
        return list;
    }
    public void swap(int[] arr, int indx, int i){
        int temp = arr[indx];
        arr[indx] = arr[i];
        arr[i] = temp;
    }
}
