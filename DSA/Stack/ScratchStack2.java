// package Stack;

import java.util.ArrayList;
// Using ArrayList -> 
public class ScratchStack2 {
    static class Stack {

        private int size;

        public int getSize() {
            return size;
        }

        ArrayList<String> arr = new ArrayList<>();

        public void push(String data) {
            arr.add(data);
            size++;
        }

        public String pop() {
            if (arr.size() == 0) {
                System.out.println("stack is empty");
            }
            size--;
            return arr.remove(arr.size() - 1);
        }

        public String peek() {
            if (arr.size() == 0) {
                return "stack is empty";
            }
            return arr.get(arr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push("4");
        myStack.push("3");
        myStack.push("2");
        myStack.push("1");

        // try {
        //     while (true) {
        //         System.out.println(myStack.pop());
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        System.out.println(myStack.peek());
        // try {
        // System.out.println(myStack.pop());
        // } catch (isEmptyException e) {
        // e.printStackTrace();
        // }
    }
}
