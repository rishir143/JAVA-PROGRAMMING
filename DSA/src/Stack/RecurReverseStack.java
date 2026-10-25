package Stack;

import java.util.Stack;

public class RecurReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(8);
        st1.push(5);
        st1.push(7);
        st1.push(6);
        System.out.println(st1);
        reverse(st1);
        System.out.println(st1);
    }
    public static void PushAtBottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item = st.pop();
        PushAtBottom(st, ele);
        st.push(item);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st); //magic
        PushAtBottom(st, top);
    }
}
