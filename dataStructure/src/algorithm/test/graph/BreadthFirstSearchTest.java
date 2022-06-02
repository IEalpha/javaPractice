package algorithm.test.graph;

import algorithm.graph.BreadthFirstSearch;
import algorithm.graph.Graph;

public class BreadthFirstSearchTest {
    public static void main(String[] args) {
        Graph graph = new Graph(13);
        graph.addEdge(0, 5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 6);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(7, 8);
        graph.addEdge(9, 10);
        graph.addEdge(9, 11);
        graph.addEdge(9, 12);
        graph.addEdge(11, 12);

        BreadthFirstSearch search = new BreadthFirstSearch(graph, 7);
        int count = search.count();
        System.out.println(count);
        System.out.println(search.marked(5));
        System.out.println(search.marked(7));
    }
}
