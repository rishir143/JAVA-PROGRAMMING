package Graph;

import java.util.ArrayList;

public class dfs {
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();
        boolean[] visited = new boolean[V];


        helper(0, visited, adj);
        return ans;
    }
    public void helper(int idx, boolean[] visited, ArrayList<ArrayList<Integer>> adj){



        visited[idx] = true;
        ans.add(idx);

        for(int neighbour : adj.get(idx)){
            if(!visited[neighbour]){
                helper(neighbour, visited, adj);

            }

        }

    }
}
