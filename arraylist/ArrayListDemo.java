import java.util.*;

// import java.util.Collections;
class Mysort implements Comparator<Double> {
    public int compare(Double d1, Double d2) {
        return (int)(d1 - d2);
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();

        array.add(0.0);
        array.add(5.0);
        array.add(3.0);
        array.add(2.0);
        array.add(1.0);

        System.out.println(array.size());

        System.out.println(array.get(1));

        // array.remove(1);
        array.remove(0.0);

        // Collections.sort(array, new Mysort());

        System.out.println(array);

        int i = 0;

        while (i != array.size()) {

            System.out.println(array.get(i));
            array.set(i, 1 + array.get(i));
            i++;
        }

        array.add(0, 1.0);
        System.out.println(array);
        Collections.sort(array, new Mysort());
        System.out.println(array);
    }
}