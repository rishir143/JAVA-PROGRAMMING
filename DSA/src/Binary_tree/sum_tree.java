package Binary_tree;

public class sum_tree {
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
        System.out.println(sum(a));
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

}
