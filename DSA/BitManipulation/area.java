// package BitManipulation;

import java.util.ArrayList;

class area {

   static ArrayList<String> al = new ArrayList<>();

    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            al.add(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            // abc --> bc, cb
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currentchar);
        }
    }

    public static void main(String[] args) {
        printPerm("123", "");
    }
}
