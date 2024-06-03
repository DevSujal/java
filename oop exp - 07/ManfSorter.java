import java.util.Comparator;

public class ManfSorter implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return (p1.getManf().compareTo(p2.getManf()));
    }
}
