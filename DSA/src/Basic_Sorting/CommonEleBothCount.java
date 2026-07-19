package Basic_Sorting;

import java.util.HashSet;

public class CommonEleBothCount {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int first = count(nums1, nums2);
        int second = count(nums2, nums1);

        return new int[]{first, second};

    }

    public int count(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int ele : nums2) {
            set.add(ele);
        }

        for (int num : nums1) {
            if (set.contains(num)) {
                count++;
            }
        }
        return count;
    }
}