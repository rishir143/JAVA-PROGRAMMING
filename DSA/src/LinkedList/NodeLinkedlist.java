package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }

}



public class NodeLinkedlist {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(e.next);
        System.out.println(a.next.next.next.val);

    }
}
