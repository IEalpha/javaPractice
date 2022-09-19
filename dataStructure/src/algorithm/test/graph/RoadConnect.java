package algorithm.test.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import algorithm.graph.BreadthFirstSearch;
import algorithm.graph.DepthFirstSearch;
import algorithm.graph.Graph;

/**
 * @author LiuHanxu
 * @Classname RoadConnect
 * @Description TODO 图案例
 * @Date 2022/6/1 16:52
 */

public class RoadConnect {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(20);
        graph.addEdge(0, 1);
        graph.addEdge(6, 9);
        graph.addEdge(3, 8);
        graph.addEdge(5, 11);
        graph.addEdge(2, 12);
        graph.addEdge(6, 10);
        graph.addEdge(4, 8);
        long l1 = System.currentTimeMillis();
        DepthFirstSearch dfs = new DepthFirstSearch(graph, 9);
        System.out.println("8 9 " + dfs.marked(8));
        System.out.println("9 10 " + dfs.marked(10));
        long l2 = System.currentTimeMillis();
        System.out.println("================");
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 9);
        System.out.println("8 9 " + bfs.marked(8));
        System.out.println("9 10 " + bfs.marked(10));
        long l3 = System.currentTimeMillis();
        System.out.println("==================");
        System.out.println(l2 - l1);
        System.out.println(l3 - l2);
    }
}
