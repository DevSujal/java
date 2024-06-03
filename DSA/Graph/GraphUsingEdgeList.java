import java.util.ArrayList;
import java.util.Collections;

public class GraphUsingEdgeList {
    static class Edge {
        int src, dest, wt;

        Edge (int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        public String toString() {
            return src + " -> " + dest + " wegiht = " + wt;
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();

        System.out.println(graph);

        graph.add(new Edge(0, 2, 2));

        graph.add(new Edge(1, 2, 10));
        graph.add(new Edge(1, 3, 0));

        graph.add(new Edge(2, 0, 2));
        graph.add(new Edge(2, 1, 10));
        graph.add(new Edge(2, 3, -1));

        graph.add(new Edge(3, 1, 0));
        graph.add(new Edge(3, 2, -1));

        System.out.println(graph);

        Collections.sort(graph, new WeightSort());
        System.out.println(graph);
    }
}
