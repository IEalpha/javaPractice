package algorithm.graph;

import algorithm.linear.Queue;

public class Graph {
    private final int V;
    private int E;
    private Queue<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<>();
        }
    }

    /**
     * 获取顶点数目
     * @return
     */
    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    /**
     * 向图中添加一条v-w边
     * @param v
     * @param w
     */
    public void addEdge(int v, int w) {
        //无向图中边是无方向的
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }

    /**
     * 获取和顶点v相邻的所有顶点
     * @param v
     * @return
     */
    public Queue<Integer> adj(int v) {
        return adj(v);
    }
}
