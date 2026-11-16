package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder_dfs {
    public List<Integer> preorderTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        dfs(root, ans);
        return ans;
    }
    public void dfs(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        dfs(root.left, ans);
        dfs(root.right, ans);
    }
}
