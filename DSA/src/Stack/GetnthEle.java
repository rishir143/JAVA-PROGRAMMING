package Stack;

import java.util.Stack;

public class GetnthEle
{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(8);
        st.push(5);
        st.push(7);
        st.push(6);

        int ele = st.get(2);
        System.out.println(ele);
        int index = 2;
        while(st.size() > index + 1){
            st2.push(st.pop());

        }
        System.out.print(st.peek());
        while(st2.isEmpty()){
            st.push(st2.pop());
        }
    }
}
