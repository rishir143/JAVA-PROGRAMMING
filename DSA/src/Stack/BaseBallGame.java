package Stack;

import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> st = new Stack<>();
        for(int  i = 0; i < n; i++){
            String s = operations[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(st.peek() * 2);
            else if(s.equals("+")) {
                int top = st.pop();
                int secondTop = st.peek();
                int sum = top + secondTop;
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));

            }
        }

        int sum = 0;

        while(!st.isEmpty()){
            int top = st.pop();
            sum += top;
        }
        return sum;
    }
}
