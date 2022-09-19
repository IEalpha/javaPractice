package algorithm.graph;

/**
 * @Description TODO 深度优先算法
 */
public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph graph, int s) {
        this.marked = new boolean[graph.V()];
        this.count = 0;
        dfs(graph, s);
    }

    // 使用深度优先搜索找出G图中v顶点所有相通的顶点
    private void dfs(Graph graph, int v) {
        marked[v] = true;
        for (Integer w : graph.adj(v)) {
            if (!marked[w]) {
                dfs(graph, w);
            }
        }
        count++;
    }

    // 判断w顶点与s顶点是否相通
    public boolean marked(int w) {
        return marked[w];
    }

    // 获取与顶点s相通的所有顶点的总数
    public int count() {
        return count;
    }

}
