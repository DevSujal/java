package linkedlist;

import java.util.Comparator;

public class DescendSorter implements Comparator<String> {
    public int compare(String str1, String str2) {
        return (-str1.compareTo(str2));
    }

}

class DescendSorter2 implements Comparator<Integer> {
    public int compare(Integer str1, Integer str2) {
        return str2 - str1;
    }

}