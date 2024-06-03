import java.util.Comparator;

public class CostSorter implements Comparator<Product> {
    // public int compare(Product p1, Product p2) {
    // return (p1.getCost() < p2.getCost() ? -1
    // : (p1.getCost() > p2.getCost() ? 1
    // : p1.getMaxDis() < p2.getMaxDis() ? -1
    // : p1.getMaxDis() > p2.getMaxDis() ? 1 : p1.getPro().compareTo(p2.getPro())));
    // }
    public int compare(Product p1, Product p2) {
        return (int) (p1.getCost() - p2.getCost() != 0 ? p1.getCost() - p2.getCost()
                : p1.getMaxDis() - p2.getMaxDis() != 0 ? p1.getMaxDis() - p2.getMaxDis()
                        : p1.getPro().compareTo(p2.getPro()));
    }
}
