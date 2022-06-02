package algorithm.graph;

import algorithm.linear.Queue;

/**
 *  广度优先搜索 
 */
public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;
    private Queue<Integer> waitSearch;

    public BreadthFirstSearch(Graph graph, int s) {
        this.marked = new boolean[graph.V()];
        this.count = 0;
        this.waitSearch = new Queue<>();
        bfs(graph, s);
    }

    private void bfs(Graph graph, int v) {
        marked[v] = true;
        waitSearch.enqueue(v);
        while(!waitSearch.isEmpty()) {
            Integer w = waitSearch.dequeue();
            for(Integer i: graph.adj(w)) {
                if (!marked(i)) {
                    bfs(graph, i);
                }
            }
        }
        count++;
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }
}
