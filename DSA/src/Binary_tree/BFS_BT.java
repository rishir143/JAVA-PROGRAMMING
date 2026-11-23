package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_BT {
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
        bfs(a);

    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null) q.offer(front.left);
            if(front.right != null) q.offer(front.right);

        }
    }

}
