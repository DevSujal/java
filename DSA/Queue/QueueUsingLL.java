package Queue;

public class QueueUsingLL {
    Node head, tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        if (head == tail) {
            tail = null;
        }
        int num = head.data;
        head = head.next;
        return num;
    }

    public String toString() {
        String str = "[";
        Node currNode = head;

        if (head == null) {
            return "Queue is empty";
        }

        while (currNode.next != null) {
            str += currNode.data + ", ";
            currNode = currNode.next;
        }
        return str + currNode.data + "]";
    }

    public static void main(String[] args) {
        QueueUsingLL q1 = new QueueUsingLL();


        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        q1.reverseTillK(3);
        System.out.println(q1);

    }
}
