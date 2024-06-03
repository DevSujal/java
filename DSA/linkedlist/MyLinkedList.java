package linkedlist;

import java.util.ArrayList;

public class MyLinkedList {
    Node head;
    private int size;

    MyLinkedList() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public String toString() {
        Node currNode = head;
        String list = "";
        while (currNode != null) {
            list += currNode.data + " -> ";
            currNode = currNode.next;
        }
        return list + "null";
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node last = head;

        while ((last.next != null)) {
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node last = head;
        Node secondLast = last.next;

        while (secondLast.next != null) {
            last = secondLast;
            secondLast = secondLast.next;
        }
        last.next = null;
        size--;
    }

    public int getsize() {
        return size;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public void reverseUsingIterator() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node prev = head, curr = head.next;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseUsingRecursion(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public void deletenthfromend(int n) {
        int n2 = n;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            clear();
            return;
        }
        if (n == size) {
            head = head.next;
            size--;
            return;
        }
        n = getsize() - n - 1;
        Node curr = head.next;
        Node prev = head;
        while (n > 0) {
            prev = curr;
            curr = curr.next;
            n--;
        }

        System.out.println("the " + n2 + " th node from last is : " + curr.data);
        prev.next = curr.next;
        size--;
    }

    public boolean isPalibdrom() {
        Node curr = head;

        ArrayList<Node> mylist = new ArrayList<>();

        while (curr != null) {
            mylist.add(curr);
            curr = curr.next;
        }
        int i = 0;
        while (i <= mylist.size() / 2 - 1) {
            if (mylist.get(i).data != mylist.get(mylist.size() - i - 1).data) {
                return false;
            }
            i++;
        }
        return true;
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node khargosh = head;
        Node kuchua = head;

        while (khargosh.next != null && khargosh.next.next != null) {
            khargosh = khargosh.next.next;
            kuchua = kuchua.next;
        }
        System.out.println("the middle node is : " + kuchua.data);
    }

    public boolean findIsLoop() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node khargosh = head;
        Node kuchua = head;

        while (khargosh.next != null && khargosh.next.next != null) {
            khargosh = khargosh.next.next;
            kuchua = kuchua.next;
            if (khargosh == kuchua) {
                return true;
            }
        }
        return false;
    }

    public void reverseTillK(int k) {

        Node curr = head, prev = null, next = null;
        Node curr2 = head;
        while (k > 0) {
            if(curr == null){
                break;
            }
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        head = prev;
        curr2.next = next;
    }



}
class Test2 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();


        list.addFirst("my");
        list.addLast("sujal");
        list.addLast("nimje");
        list.addLast("jhsljd");
        list.reverseTillK(3);
        System.out.println(list);
        // list.deleteFirst();
        // list.deleteLast();
        // list.addFirst("is");
        // list.addFirst("name");
        // list.addFirst("my");
        // list.addLast("nimje");
        // System.out.println(list);
        // System.out.println(list.getsize());
        // list.clear();
        // list.addFirst("1");
        // list.addLast("2");
        // list.addLast("3");
        // list.addLast("4");
        // System.out.println(list);
        // list.reverseUsingIterator();
        // list.head = list.reverseUsingRecursion(list.head);
        // System.out.println(list);
        // list.clear();
        // System.out.println(list);
        // list.addFirst("1");
        // list.addLast("2");
        // list.addLast("3");
        // list.addLast("4");
        // System.out.println(list);
        // list.deletenthfromend(1);
        // System.out.println(list);
        // list.clear();
        // list.addLast("1");
        // list.addLast("2");
        // list.addLast("2");
        // System.out.println(list);

        // list.addFirst("1");
        // list.addLast("2");
        // list.addLast("2");
        // list.addLast("1");
        // list.addLast("1");

        // System.out.println(list.isPalibdrom());
        // System.out.println(list);
        // list.findMiddle();

        // System.out.println(list.findIsLoop());
        // System.out.println(list);
    }
}
