package linkedlist;

import java.util.*;

public class CollectionLL {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.addFirst("my");
        myList.addLast("name");
        myList.add("sujal");
        myList.add(2, "is");
        myList.remove("is");
        // myList.clear();
        myList.add(2, "is");
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " -> ");
        }
        System.out.println("null");
        System.out.println(myList);
        System.out.println(myList.size());
        Collections.sort(myList, new DescendSorter());
        // while (itr.hasNext()) {
        //     System.out.print(itr.next() + " -> ");
        // }
        System.out.println("null");
        System.out.println(myList);
        // myList.clear();
        LinkedList<Integer> myList2 = new LinkedList<>();
        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(4);
        System.out.println(myList2);
        Collections.sort(myList2, new DescendSorter2());
        System.out.println(myList2);
        Iterator<String> ditr = myList.descendingIterator();

        ListIterator<String> litr = myList.listIterator();
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        while(ditr.hasNext()){
        System.out.println(ditr.next());
        }
        System.out.println(myList);

    }
}
