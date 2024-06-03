import java.util.HashSet;

public class subsequnce2 {
    // Super important question
    public static void subSequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            }
            System.out.println(newStr);
            set.add(newStr);
            return;
        }
        // agar vo jana chahta hai
        subSequence(str, idx + 1, newStr + str.charAt(idx), set);

        // agar vo nahi jana chahta
        subSequence(str, idx + 1, newStr, set);

    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        subSequence("aaa", 0, "", set);

    }
}
