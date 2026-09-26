package LinkedList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;

        while(curr != null){
            n++;
            curr = curr.next;
        }

        int fixNode = n / k;
        int extra = n % k;

        ListNode[] ans = new ListNode[k];
        curr = head;

        for(int i = 0 ; i < k; i++){
            ans[i] = curr;

            int size = fixNode + (i < extra ? 1 : 0);

            for(int j = 1; j < size && curr != null; j++){
                curr = curr.next;
            }

            if(curr != null){
                ListNode nextNode = curr.next;
                curr.next = null;
                curr = nextNode;
            }
        }
        return ans;
    }
}
public class SplitLinkedListInparts {
}
