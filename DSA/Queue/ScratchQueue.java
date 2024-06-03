package Queue;
// Queue -> First In First Out Data Structure (FIFO)

// these is the scratch implementaion of queue using array 
// peek -> top/front element ko jhaak ke dekhna 

// Isme major 3 methods hote hai 
// 1) add(Enqueue) -> inserting the element
// 2) remove(Dequeue) -> deleting element from queue
// 3) peek -> top/front element ko jhaak ke dekhna 
public class ScratchQueue {

    private int[] arr;
    int front, rear, max;

    public ScratchQueue(int size) {
        arr = new int[size]; // we can also use LinkedList here
        front = -1;
        rear = -1;
        max = size;
    }

    public ScratchQueue() {
        arr = new int[10]; // we can also use LinkedList here
        front = -1;
        rear = -1;
        max = 10;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void add(int data) {

        if (rear == max - 1) {
            System.out.println("Overflow");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[rear] = data;
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        if (front == rear) {
            int num = arr[front];
            front = -1;
            rear = -1;
            return num;
        }
        return arr[front++];
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
        } else if (front == rear) {
            return "[" + arr[front] + "]";
        }
        int num = front;

        String str = "[";
        while (num < rear) {
            str += arr[num] + ", ";
            num++;
        }
        return str + arr[num] + "]";
    }

    public int halfreverse(int k, int top) {
        if (isEmpty()) {
            return top;
        }
        if (k == 0) {
            return top;
        }
        top = remove();
        int mytop = halfreverse(k - 1, top);
        add(top);
        return mytop;
    }

    public void reverseTillK(int k) {
        int top = halfreverse(k, -1), x;
        while ((x = peek()) != top) {
            add(remove());
        }
    }
}

class Test {
    public static void main(String[] args) {
        ScratchQueue myQueue = new ScratchQueue(10);

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        // myQueue.add(5);
        // myQueue.add(6);
        // myQueue.add(5);
        // myQueue.add(6);
        System.out.println(myQueue);
        myQueue.reverseTillK(5);
        // myQueue.remove();
        // myQueue.remove();
        // myQueue.remove();
        // myQueue.remove();
        // myQueue.remove();
        // System.out.println(myQueue.peek());

        System.out.println(myQueue);
    }
}
