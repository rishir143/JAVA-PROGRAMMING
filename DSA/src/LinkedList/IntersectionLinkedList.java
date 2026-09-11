//package LinkedList;
//
//public class IntersectionLinkedList {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int lenA = getLen(headA);
//        int lenB = getLen(headB);
//
//        if(lenA > lenB) headA = move(headA, lenA - lenB);
//        else headB = move(headB, lenB - lenA);
//
//        while(headA != headB){
//            headA = headA.next;
//            headB = headB.next;
//        }
//        return headA;
//    }
//    public int getLen(ListNode head){
//        ListNode temp = head;
//        int length = 0;
//        while(temp != null){
//            length++;
//            temp = temp.next;
//        }
//
//        return length;
//    }
//    public ListNode move(ListNode head, int steps){
//        while(steps > 0 && head != null){
//            head = head.next;
//            steps--;
//        }
//        return head;
//    }
//}
