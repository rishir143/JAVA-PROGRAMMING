package Stack;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Stack;

public class NextGreaterEle {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.add(arr[n - 1]);
        ans.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            if(!st.isEmpty() && st.peek() > arr[i]) {
                ans.add(st.peek());
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && arr[i] >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans.add(-1);
                    st.push(arr[i]);
                }
                else {
                    ans.add(st.peek());
                    st.push(arr[i]);
                }
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}
