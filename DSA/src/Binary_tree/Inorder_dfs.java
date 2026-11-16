package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Inorder_dfs {
    public List<Integer> inorderTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        dfs(root, ans);
        return ans;
    }
    public void dfs(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);
    }
}
