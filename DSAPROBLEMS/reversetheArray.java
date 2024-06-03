import java.util.Stack;

public class reversetheArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        // Stack<Integer> myStack = new Stack<>();
        // for (int i : arr) {
        // myStack.push(i);
        // }for (int i = 0; i < arr.length; i++) {
        // arr[i] = myStack.pop();
        // }
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
