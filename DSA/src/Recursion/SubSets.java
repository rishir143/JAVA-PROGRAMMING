package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
    helper(0, new ArrayList<>() ,nums,  result);
        return result;
    }
    public void helper( int indx, List<Integer> current ,int[] nums, List<List<Integer>> result ){
if(indx == nums.length){
    result.add(new ArrayList<>(current));
    return;
}
        current.add(nums[indx]); //pick kro
    helper( indx + 1,current, nums, result);

    current.remove(current.size() - 1);
    //skip beta
    helper( indx + 1, current, nums, result);


    }

}
