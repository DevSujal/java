import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public String toString() {
            return src + " -> " + dest + " wegiht = " + weight;
        }
    }

    public void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) { // super imp without these arraylist cannot be built
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 3, 0));

        // graph[3].add(new Edge(3, 0, 0));
    }

    public void findNeigbers(ArrayList<Edge> graph[]) {

        for (ArrayList<Edge> arrayList : graph) {
            Iterator<Edge> itr = arrayList.iterator();

            while (itr.hasNext()) {
                System.out.print(itr.next() + "  ");
            }
            System.out.println();
        }
    }

    // these is for normal that is not subgraph
    // O(V + E) -> time complexity
    public void bfs(ArrayList<Edge> graph[], int verteces) {
        boolean arr[] = new boolean[verteces];
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!arr[curr]) {
                System.out.print(curr + " ");
                arr[curr] = true;
                Iterator<Edge> itr = graph[curr].iterator();
                while (itr.hasNext()) {
                    q.add(itr.next().dest);
                }
            }
        }
    }

    // jab graph ke bohot sare tukde ho hamare pas tab ye wala lagega
    // O(V + E) -> time complexity
    public void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                Iterator<Edge> itr = graph[curr].iterator();
                while (itr.hasNext()) {
                    q.add(itr.next().dest);
                }
            }
        }
    }

    // for both single and tutte hue graphs but for tutte hue we have to use for
    // loop just like we use it in bfs
    public void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {

        System.out.print(curr + " ");
        vis[curr] = true;

        Iterator<Edge> itr = graph[curr].iterator();

        while (itr.hasNext()) {
            int dest = itr.next().dest;
            if (!vis[dest])
                dfs(graph, dest, vis);
        }
    }

    public void printAllPaths(ArrayList<Edge> graph[], int curr, boolean vis[], int target, ArrayList<Integer> al) {
        if (curr == target) {
            System.out.println(al);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            int dest = graph[curr].get(i).dest;
            if (!vis[dest]) {
                vis[curr] = true;
                al.add(dest);
                printAllPaths(graph, dest, vis, target, al);
                vis[curr] = false;
                al.remove(al.size() - 1);
            }
        }
    }

    // cycle detection for directed graph
    public boolean isCyclic(ArrayList<Edge> graph[], int curr, boolean vis[], boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        Iterator<Edge> itr = graph[curr].iterator();
        while (itr.hasNext()) {
            int dest = itr.next().dest;
            if (rec[dest] == true) {
                return true;
            }
            if (!vis[dest])
                return isCyclic(graph, dest, vis, rec);
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge> graph[] = new ArrayList[v];
        Graph g = new Graph();
        g.createGraph(graph);
        // g.findNeigbers(graph);
        // g.bfs(graph, v); // these is for normal graphs
        boolean vis[] = new boolean[v];
        // for(int i = 0; i < vis.length; i++){ // these is for tukde of graph
        // if(!vis[i]){
        // g.bfs(graph, v, vis, i);
        // }
        // }
        g.dfs(graph, 3, new boolean[v]);
        System.out.println();
        // for (int i = 0; i < v; i++) {
        // if (!vis[i]) {
        // g.dfs(graph, i, vis);
        // }
        // }
        int src = 0;
        int dest = 3;
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(src);
        // g.printAllPaths(graph, src, vis, dest, al);

        System.out.println(g.isCyclic(graph, src, new boolean[v], new boolean[v]));
    }
}