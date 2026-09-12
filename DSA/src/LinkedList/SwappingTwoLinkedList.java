package LinkedList;

public class SwappingTwoLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode second = head;
        ListNode fast = head;
        ListNode first = head;

        for(int i = 1; i < k; i++){
            fast = fast.next;

        }
        first = fast;

        // for(int i = 0; i < k - 1; i++){
        //     prev = prev.next;

        // }

        while(fast.next != null){
            second = second.next;
            fast = fast.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
