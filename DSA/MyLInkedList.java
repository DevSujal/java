// This is a scratch implementation of linked list
public class MyLInkedList {
    Node head;
    private int size;

    MyLInkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        size--;
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;

        Node lastNode = secondLast.next;
        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public String toString() {
        Node currNode = head;
        String display = "";
        while (currNode != null) {
            display += currNode.data + " -> ";
            currNode = currNode.next;
        }
        return display + null;
    }
    public boolean isPalibdrom(){

        return true;
    }
    public void deletenthfromend(int n){
        n = size - n;
        Node curr = head.next;
        Node prev = head;
        while(curr != null && n-- > 0){
            prev = curr;
            curr.next = curr;
        }
        prev.next = curr.next;

    }
}

class Test {
    public static void main(String[] args) {

        MyLInkedList list = new MyLInkedList();

        list.addFirst("My");
        list.addLast("sujal");
        System.out.println(list);
        list.deleteLast();
        System.out.println(list);
        list.deleteFirst();
        list.addFirst("My");
        list.addLast("name");
        list.addLast("is");
        list.addLast("sujal");
        System.out.println(list);
        System.out.println(list.getSize());

        // linked list palindrom hai ya nahi

    }

}