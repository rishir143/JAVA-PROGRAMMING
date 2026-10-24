package Stack;

import java.util.Stack;

public class ReverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();


        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(8);
        st1.push(5);
        st1.push(7);
        st1.push(6);
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()){
            st3.push(st2.pop());
        }
        while(!st3.isEmpty()){
            System.out.print(st1.push(st3.pop()) + " ");
        }
        System.out.println();
        System.out.println(st1.peek());

    }
}
