package Binary_tree;

public class size_tree {
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
        System.out.println(size(a));
    }
    public static int size(Node root){
//        if(root == null) return 0;
//        return 1 + size(root.left) + size(root.right);
//         beautifull
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }
    }
