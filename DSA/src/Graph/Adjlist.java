package Graph;

import java.util.ArrayList;

public class Adjlist {
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = new int[4][4];
        boolean isDirected = true;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V ; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);

            if(!isDirected){
                adj.get(v).add(u);

            }
        }

    }
}
