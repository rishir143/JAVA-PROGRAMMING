package Stack;

import java.util.Stack;

public class traversingStack {


    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);

        while(st1.size() > 0) {
            int ele = st1.pop();
            st2.push(ele);
            System.out.print(ele + " ");
        }

        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }



}
