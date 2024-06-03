/**
 * binarySearch
 */
public class binarySearch {
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

    static int search(int first, int last, int mid, int element) {
        if(first > last){
            return -1;
        }
        if (element < arr[mid]) {
            search(first, mid - 1, (first + mid - 1) / 2, element);
        } else if (element == arr[mid]) {
            return mid;
        } else {
            search(mid + 1, last, (mid + 1 + last) / 2, element);
        }
        return 0;
    }

    public static void main(String[] args) {

        int first = 0, last = arr.length - 1, mid = last / 2;
        int element = 5;
        while (first <= last) {
            if (element < arr[mid]) {
                last = mid - 1;
            } else if (element == arr[mid]) {
                System.out.println("mil gaya " + 5);
                break;
            } else {
                first = mid + 1;
            }
            mid = (first + last) / 2;
        }
        System.out.println(
                search(0, arr.length - 1, (arr.length - 1) / 2, 5)
                );
    }
}