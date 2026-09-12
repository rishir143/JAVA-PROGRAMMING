package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode prev = head;
        ListNode curr = head;
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        k =  k % len; //remember this % not /
        if(k == 0) return head;

        for(int i = 0; i < k; i++){
            curr = curr.next;
        }
        while(curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }

        curr.next = head;
        head = prev.next;
        prev.next = null;

        return head;

    }
}
