package LinkedList;


class LinkedList{
    private  Node head;
    private Node tail;
    int size;

   void addTail(int val̥){
        Node temp = new Node(val̥);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }
    void AddAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteFromHead(){
       if(head == null) {
           System.out.println("List is Empty!");
           return;
       }

       else {
           head = head.next;
           size--;
       }
    }

    int get(int val, int idx){
       Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    int search(int val){
       if(head == null) return -1;
       Node temp = head;
       int idx = 0;
       while(temp != null) {
           if(temp.val == val) return idx;
       temp = temp.next;
       idx++;
       }
       return -1;
    }

    void insert(int val, int idx) {

        if (idx < 0 || idx > size) System.out.println("Invalid index");
        if (idx == 0) AddAtHead(val);
        if (idx == size) addTail(val);
        else {
            Node temp = head;
            for (int i = 1; i < idx -1 ; i++) {
                temp = temp.next;
            }

            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;

        }
    }

    void delete(int idx){
       if(idx < 0 || idx > size){
           System.out.println("Invalid Index");
       }
       if(idx == 0) {
               deleteFromHead();
               return;
           }
       Node temp = head;
        for (int i = 1; i <= idx -1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        if(idx == size - 1) tail = temp;
        size--;


   }



    void display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.val + " ");
           temp = temp.next;
       }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList Ll = new LinkedList();
        Ll.addTail(10);
        Ll.addTail(5); Ll.addTail(6);
        Ll.addTail(9);
        Ll.display();
        Ll.AddAtHead(8);
        Ll.display();

        System.out.println(Ll.search(6));
        Ll.display();

        System.out.println(Ll.size);
        Ll.insert(78, 4);
        Ll.display();
        Ll.deleteFromHead();
        Ll.display();

        Ll.delete(2);
        Ll.display();
    }

}
