package LinkedList;

public class partitionLL {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode large = largeDummy;

        ListNode curr = head;

        while(curr != null){
            if(x > curr.val){
                small.next = curr;
                small = small.next;
            }
            else{
                large.next = curr;
                large = large.next;
            }

            curr = curr.next;
        }

        small.next = largeDummy.next;
        large.next = null;

        return smallDummy.next;
    }
}
