package Binary_tree;

public class MaxVal {
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
        System.out.println(max(a));
        System.out.println(min(a));
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
}
