// package Stack;
// last in first out 


// there are three operation of stack ->
// 1) push o(1) -> stack ke upper append karna
// 2) pop o(1) -> stack ke top pe jo element hai use stack ke top se nikal lena na
// 3) peek o(1) -> just like a pop but ye hatata nahi hai sirf return karta hai

// 3 tarike se stack ko iplement kar sakte hai 
// 1) Array -> fixed size thats why avoid it
// 2) ArrayList
// 3)LinkedList

// Using linked list 
public class scratchStack {

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private static int size = 0;
        public static Node head;

        public int getSize() {
            return size;
        }

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(String data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                size++;
                return;
            }

            newNode.next = head;
            head = newNode;
            size++;
        }

        public static String pop() {
            if (isEmpty()) {
                return "list is empty";
            } 
            String top = head.data;
            head = head.next;
            size--;
            return top;
        }
        public static String peek() {
            if (isEmpty()) {
                return "list is empty";
            }
            return  head.data;
    }
}
public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push("4");
        myStack.push("3");
        myStack.push("2");
        myStack.push("1");

        while(!(myStack.isEmpty())){
            System.out.println(myStack.peek());
            myStack.pop();
        }

    }
}
