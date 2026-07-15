package Two_D_Array;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Traversal {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;
            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = m -1;

            while(top <= bottom && left <= right){
                for (int i = left; i <= right ; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;
                if(top > bottom) break;
                for (int i = top; i <= bottom ; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;
                if(left > right) break;
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            return ans;
        }
    }
}
