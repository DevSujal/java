import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> queue = new LinkedList<>();

        public void push(int element) {
            queue.add(element);
        }

        int top;
        public int pop(int start, int size) {
            if (start >= size) {
                top = queue.poll();
                return top;
            }
            queue.add(queue.poll());
            pop(start + 1, size);
            return top;
        }

        int pop() {
            return (pop(1, queue.size()));
        }
        public void display(){
            System.out.println(queue);
        }
        public static void main(String[] args) {
            Stack s1 = new Stack();

            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);
            s1.display();
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            s1.display();
        }
    }
}
