import java.util.Comparator;

public class WeightSort implements Comparator<GraphUsingEdgeList.Edge> {
    public int compare(GraphUsingEdgeList.Edge e1, GraphUsingEdgeList.Edge e2) {
        return e1.wt - e2.wt;
    }
}
