package Binary_tree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }

}

public class Implementation {


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        Node g = new Node(9);


        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        display(a);

    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

}
