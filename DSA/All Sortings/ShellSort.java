public class ShellSort {

    public static void shellSort(int []arr, int size) {
        int n = size / 2;

        while (n > 0) {
            for (int i = n; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= n && temp < arr[j - n]; j-=n) {
                    arr[j] = arr[j - n];
                }
                arr[j] = temp;
            }
            n = n / 2;
        }
    }
    public static void printArray(int []arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // Testing the code with a sample array of integers
        int[] testArr = {123,456,789,12,345,678};
        shellSort(testArr, testArr.length);
        printArray(testArr);
    }
}
