public class CountSort {
    public static int max(int arr[]) {
        int max = 0;
        for (int i : arr) {
            max = i > max ? i : max;
        }
        System.out.println(max);
        return max;
    }

    public static void countSort(int []arr, int size){
        int arr1[] = new int[max(arr) + 1];
        int arr2[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[arr[i]]++;
        }

        for (int i = 1; i < arr1.length; i++) {
            arr1[i] += arr1[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            arr2[arr1[arr[i]] - 1] = arr[i];
            arr1[arr[i]]--;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }
    }
    public static void printArray(int []arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 12, 1, 5, 5, 3, 9};
        int n = arr.length;
        countSort(arr, n);
        printArray(arr);
    }
}
