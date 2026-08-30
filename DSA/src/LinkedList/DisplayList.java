package LinkedList;

import java.util.Scanner;

public class DisplayList {
    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val + " ");

        displayRec(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

//        for(Node temp = head;temp != null;temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        displayRec(a);

        System.out.println(get(a, 2));
//        Node n = null;
//        n.val = 10;
//        System.out.println(n.val);
//        System.out.println(n.next);
    }

    public static int get(Node head, int idx){
        Node temp = head;
        int count = 0;
        while(temp != null){

            if(idx == count){
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

//    public static int get(Node head, int indx){
//        Node temp = head;
//        for (int i = 1; i <=indx ; i++) {
//            temp = temp.next;
//        }
//        return temp.val;
//    }

}
