package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        ArrayList<Integer> nums = new ArrayList<>();
        int carry = 1;
        for(int i = n - 1; i >=0; i--){

            int ele = arr[i] + carry;
            if(ele > 9){
                ele  %=10;
                nums.add(ele);
                carry = 1;

            }
            else {
                nums.add(ele);
                carry = 0;
            }
        }
        if(carry == 1) nums.add(carry);
        Collections.sort(nums);
        int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) ans[i] = nums.get(i);
    }
}
