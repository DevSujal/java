import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {

    public void mergeSort(int arr[]) {
        divide(arr, 0, arr.length - 1);
    }

    private void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    private void conquer(int arr[], int si, int ei, int mid) {
        int[] mergedArray = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            mergedArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = {999, 99, 9};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            al.add(i);
        }
        System.out.println(al);
        MergeSort mySort = new MergeSort();

        mySort.mergeSort(arr);
        for (int i : arr) {
            System.out.append(i + " ");
        }
        Collections.sort(al);
        System.out.println(al);

    // 1  9 -> 5


     }

}