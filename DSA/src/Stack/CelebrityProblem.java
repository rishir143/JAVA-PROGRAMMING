package Stack;

import java.util.Stack;

public class CelebrityProblem {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        Stack<Integer> st = new Stack<>();
        if(n == 1) return 0;
        for(int i = 0; i < n; i++){
            st.push(i);
        }

        for (int i = 0; i < n - 1; i++) {
            if(st.size() < 2) break;
            int A = st.pop();
            int B = st.pop();

            if(mat[A][B] == 1){
                st.push(B);
            }
            else{
                st.push(A);
            }

            if(st.isEmpty()) return -1;
        }

        if(!st.isEmpty()){
            int top = st.peek();
            for (int i = 0; i <n; i++) {
                if(i == top) continue;
                if(mat[top][i] == 1 || mat[i][top] == 0){
                    return -1;
                }
            }
        }
        return st.peek();
    }
}
