import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        // selection sort
        int post;
        for (int i = 0; i < arr.length; i++) {
            post = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[post]) {
                    post = j;
                }
            }
            if (post != i) {
                arr[post] = arr[post] + arr[i];
                arr[i] = arr[post] - arr[i];
                arr[post] = arr[post] - arr[i];
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Binary search
        System.out.print("\nenter the number which have to find : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = 0, last = arr.length, mid = last / 2;
        while (first < last) {
            if (number < arr[mid]) {
                last = mid;
            } else if (number == arr[mid]) {
                System.out.println("the entered number is found in " + (mid + 1) + " position");
                break;
            } else {
                first = mid + 1;
            }
            mid = (first + last) / 2;
        }
        sc.close();
    }
}
