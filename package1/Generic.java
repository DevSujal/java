public class Generic {

}

class Array<T extends Number> {
    T[] array;

    Array(T[] array) {
        this.array = array;
    }

    public double arraySum() {
        double sum = 0;

        for (T arr : array) {
            sum += arr.doubleValue();
        }
        return sum;
    }

    public boolean isEqual(Array<? extends Number> array) {

        if (this.arraySum() == array.arraySum()) {
            return true;
        }
        return false;
    }
}

class Test {

    public static void main(String[] args) {

        // Float array[] = { 1.0f, 2.0f, 2.5f, 3.5f, 5.0f };
        // Double array2[] = { 1.0, 2.0, 2.5, 3.5, 5.0 };

        // Array<Float> a = new Array<Float>(array);
        // Array<Double> b = new Array<Double>(array2);

        // System.out.println(a.arraySum());
        // System.out.println(a.isEqual(b));

        Float array[] = { 1.0f, 2.0f, 2.5f, 3.5f, 5.0f };
        Double array2[] = { 1.0, 2.0, 2.5, 3.5, 5.0 };

        Array2 a = new Array2();
        Array2 b = new Array2();

       a.arraySum(array);
    }
}

class Array2 {
    public <T extends Number> void arraySum(T[] array) {
        double sum = 0;
        for (T arr : array) {
            sum += arr.doubleValue();
        }
        System.out.println("sum of the array eleament is : " + sum);
    }
}
