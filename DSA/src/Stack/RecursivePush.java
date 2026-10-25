package Stack;

import java.util.Stack;

public class RecursivePush {
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

        int element = 9;

        PushAtBottom(st1 , element);

        while(st1.size() > 0) {

            st2.push(st1.pop());

        }

        while(st2.size() > 0){
            int ele = st2.pop();
            st1.push(ele);
            System.out.print(ele + " ");
        }

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
}

