package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class SttockSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        Stack<Integer> st  = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>(n);
        if(n == 0) return result;
        st.push(0);
        result.add(1);
        for (int i = 1; i < n ; i++) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();

            if(st.isEmpty()){
                result.add(i + 1);
            }
            else{
                int idx = st.peek();
                int val = i - idx;
                result.add(val);
            }
            st.push(i);

        }

        return result;

    }

    }

