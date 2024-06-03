/**
 * maxmininArray
 */
public class maxmininArray {

    static class pair {
        int min;
        int max;

        public String toString() {
            return "the max = " + max + " and the min = " + min;
        }
    }

    static pair getminmax(int[] arr, int low, int high) {
        pair minmax = new pair();
        pair mml = new pair();
        pair mmr = new pair();
        int mid;

        if (low == high) {
            minmax.min = arr[low];
            minmax.max = arr[high];
            return minmax;
        } else if (high == low + 1) {
            if (arr[low] < arr[high]) {
                minmax.min = arr[low];
                minmax.max = arr[high];
            } else {
                minmax.min = arr[high];
                minmax.max = arr[low];
            }
            return minmax;
        }
        mid = (low + high) / 2;
        mml = getminmax(arr, low, mid);
        mmr = getminmax(arr, mid + 1, high);
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }

        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 3, 2, 1, 0 }, position;

        for (int i = 0; i < arr.length; i++) {
            position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[position] > arr[j]) {
                    position = j;
                }
            }
            if (position != i) {
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nmax = " + arr[arr.length - 1]);
        System.out.println("min = " + arr[0]);
        System.out.println(getminmax(arr, 0, arr.length - 1));
    }
}