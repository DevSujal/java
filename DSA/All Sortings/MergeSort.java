
public class MergeSort {
    public static void divide(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }
        int mid = (first + last) / 2;
        divide(arr, first, mid);
        divide(arr, mid + 1, last);
        merge(arr, first, last, mid);
    }

    public static void merge(int[] arr, int first, int last, int mid) {
        int[] mergedArray = new int[last + 1 - first];
        int idx1 = first;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= last) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
                continue;
            }
            mergedArray[x++] = arr[idx2++];
        }

        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }
        while (idx2 <= last) {
            mergedArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = first; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public static void mergeSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] array = { 9, 5, 6, 8, 3, 7 };
        mergeSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}