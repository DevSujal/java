package Queue;

public class CircularQueue {
    static class Queue {
        private int[] arr;
        private int front, rear, max;

        public Queue(int size) {
            arr = new int[size]; // we can also use LinkedList here
            front = -1;
            rear = -1;
            max = size;
        }

        public Queue() {
            arr = new int[10]; // we can also use LinkedList here
            front = -1;
            rear = -1;
            max = 10;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {

            if (front == rear + 1) {
                System.out.println("Overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
                rear = 0;
                arr[rear] = data;
                return;
            }
            rear = (rear + 1) % max;
            arr[rear] = data;
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
                return;
            }
            front = (front + 1) % max;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        public String toString() {

            if (isEmpty()) {
                return "queue is empty";
            }
            int num = front;

            String str = "[";
            while (rear != (num)) {
                str += arr[num] + ", ";
                num = (num + 1) % max;
            }
            return str + arr[num] + "]";
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(2);

        myQueue.add(10);
        // myQueue.add(20);
        // myQueue.add(30);
        // myQueue.add(40);
        // myQueue.add(50);
        // myQueue.remove();
        // myQueue.add(10);
        // myQueue.remove();
        // myQueue.add(20);

        System.out.println(myQueue);
    }
}
