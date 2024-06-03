package Heap;

public class Heap {

    public static void heapify(int[] arr, int n) {
        int i = 1;
        while (i < n) {
            int leftChild = 2 * i;
            int rightChild = 2 * i + 1;

            int larger = arr[leftChild] > arr[rightChild] ? 2 * i : 2 * i + 1;

            if (arr[i] < arr[larger]) {
                // swap
                swap(arr, larger, i);
                i = larger;
                continue;
            }
            return;
        }
    }

    public static void swap(int[] arr, int i, int n) {
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }

    public static void heapify(int arr[], int n, int i) {
        if (i >= n / 2 - 1) {
            return;
        }
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (largest < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (largest < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

    public static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void delete(int[] arr, int n) {
        arr[1] = arr[n - 1];
        n = n - 1;
        heapify(arr, n);
    }

    public static void insert(int[] arr, int n, int element) {
        arr[n] = element;
        int i = n / 2;
        while (i > 1) {
            i = n / 2;
            if (arr[i] < arr[n]) {
                swap(arr, i, n);
                n = i;
                continue;
            }
            return;
        }
        i = n / 2;
        if (arr[i] < arr[n]) {
            swap(arr, i, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 70, 65, 40, 10, 5, 20, 30, 60 };
        // insert(arr, arr.length - 1, 6);
        // delete(arr, arr.length - 1);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        buildHeap(arr, arr.length);
        heapSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
