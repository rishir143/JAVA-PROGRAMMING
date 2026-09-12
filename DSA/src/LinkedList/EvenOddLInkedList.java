package LinkedList;

public class EvenOddLInkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);

        ListNode odd = oddDummy;
        ListNode even = evenDummy;

        ListNode curr = head;

        while(curr != null){
            //odd
            odd.next = curr;
            odd = odd.next;
            curr = curr.next;

            //even
            if(curr != null){
                even.next = curr;
                even = even.next;
                curr = curr.next;
            }

        }

        odd.next = evenDummy.next;
        even.next = null;

        return oddDummy.next;

    }
}
