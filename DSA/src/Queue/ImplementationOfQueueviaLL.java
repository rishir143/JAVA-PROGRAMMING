package Queue;

public class ImplementationOfQueueviaLL {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    // Queue class
    class myQueue {
        Node head;
        Node tail;
        int size;

        public myQueue() {
            head =null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }

        public void enqueue(int x) {
            Node temp = new Node(x);
            if(size == 0) head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        public void dequeue() {
            if(size == 0){
                System.out.println("The Queue is empty");
                return;
            }
            else {
                head = head.next;
                size--;
            }
        }

        public int getFront() {
            if(size == 0){
                return -1;
            }
            else return head.data;
        }

        public int size() {
            return size;
        }
    }

}
