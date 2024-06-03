public class FibonaciSeries {

    static void printFibo(int n, int a, int b) {
        if (b >= n) {
            return;
        }
        System.out.print((a + b) + " ");
        printFibo(n, b, a+b);
    }

    public static void main(String[] args) {
        System.out.print("0 1 ");
        int a = 0, b = 1;
        printFibo(100, a, b);
    }
}
