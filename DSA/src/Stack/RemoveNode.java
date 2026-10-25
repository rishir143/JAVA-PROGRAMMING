package Stack;

public class RemoveNode {
//    public ListNode removeNodes(ListNode head) {
//        Stack<Integer> st = new Stack<>();
//        while(head != null){
//            if(st.isEmpty()){
//                st.push(head.val);
//            }
//            else if(head.val <= st.peek()) st.push(head.val);
//            else{
//                while( !st.isEmpty() && head.val > st.peek()){
//                st.pop();
//            }
//            st.push(head.val);
//
//            }
//            head = head.next;
//        }
//    ListNode temp = null;
//     while(!st.isEmpty()){
//
//        ListNode a = new ListNode(st.pop());
//        a.next = temp;
//        temp = a;
//     }
//     return temp;
//    }
}
