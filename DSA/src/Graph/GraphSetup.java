package Graph;

import java.util.ArrayList;

public class GraphSetup {
}
class Graph{
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int v){
        this.V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v ; i++) {
            adj.add(new ArrayList<>());
        }

    }
    void addEdge(int v, int u){
    adj.get(v).add(u);
    adj.get(v).add(v);
    }
}
