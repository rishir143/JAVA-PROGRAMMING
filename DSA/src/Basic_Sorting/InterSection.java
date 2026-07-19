package Basic_Sorting;

import java.util.HashSet;

public class InterSection {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();


        for(int ele : nums1){
            a.add(ele);

        }

        for(int num : nums2){
            if(a.contains(num)){
                b.add(num);
            }
        }
        int[] result = new int[b.size()];

        int i = 0;
        for(int num : b){
            result[i++] = num;
        }
        return result;
    }
}
